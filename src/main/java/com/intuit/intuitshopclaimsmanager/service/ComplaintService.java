package com.intuit.intuitshopclaimsmanager.service;

import com.intuit.intuitshopclaimsmanager.model.Complaint;

import com.intuit.intuitshopclaimsmanager.model.Purchase;
import com.intuit.intuitshopclaimsmanager.model.User;
import com.intuit.intuitshopclaimsmanager.repository.ComplaintRepository;
import com.intuit.intuitshopclaimsmanager.repository.PurchaseRepository;
import com.intuit.intuitshopclaimsmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<Complaint> createComplaint(Complaint complaint) {
        if (complaint.getSubject() == null || complaint.getContent() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Subject and content are required.");
        }

        UUID userId = complaint.getUser().getId();
        UUID purchaseId = complaint.getPurchase().getId();

        User user = restTemplate.getForObject("http://localhost:8081/users/" + userId, User.class);
        if (user == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User not found");
        }

        Purchase purchase = restTemplate.getForObject("http://localhost:8081/purchases/" + purchaseId, Purchase.class);
        if (purchase == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Purchase not found");
        }

        complaint.setUser(user);
        complaint.setPurchase(purchase);

        Complaint savedComplaint = repository.save(complaint);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedComplaint);
    }

    public ResponseEntity<Complaint> getComplaintById(UUID id) {
        return ResponseEntity.of(java.util.Optional.of(repository.getReferenceById(id)));
    }
}

