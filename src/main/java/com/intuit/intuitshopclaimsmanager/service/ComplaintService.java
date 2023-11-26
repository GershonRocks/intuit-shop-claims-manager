package com.intuit.intuitshopclaimsmanager.service;

import com.intuit.intuitshopclaimsmanager.model.Complaint;

import com.intuit.intuitshopclaimsmanager.repository.ComplaintRepository;
import com.intuit.intuitshopclaimsmanager.repository.PurchaseRepository;
import com.intuit.intuitshopclaimsmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepository repository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    public ResponseEntity<Complaint> createComplaint(Complaint complaint) {
        if (complaint.getSubject() == null || complaint.getContent() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Subject and content are required.");
        }

        Complaint savedComplaint = repository.save(complaint);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedComplaint);
    }


    public ResponseEntity<Complaint> getComplaintById(UUID id) {
        return ResponseEntity.of(java.util.Optional.of(repository.getReferenceById(id)));
    }
}

