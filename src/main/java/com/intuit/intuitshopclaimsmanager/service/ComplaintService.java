package com.intuit.intuitshopclaimsmanager.service;

import com.intuit.intuitshopclaimsmanager.model.Complaint;

import com.intuit.intuitshopclaimsmanager.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepository repository;

    public ResponseEntity<Complaint> createComplaint(Complaint complaint) {
        return ResponseEntity.of(java.util.Optional.of(repository.save(complaint)));
    }

    public ResponseEntity<Complaint> getComplaintById(UUID id) {
        return ResponseEntity.of(java.util.Optional.of(repository.getReferenceById(id)));
    }
}

