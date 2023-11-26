package com.intuit.intuitshopclaimsmanager.controller;

import com.intuit.intuitshopclaimsmanager.model.Complaint;

import com.intuit.intuitshopclaimsmanager.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {
    @Autowired
    private ComplaintService service;

    @PostMapping
    public ResponseEntity<Complaint> createComplaint(@RequestBody Complaint complaint) {
        return service.createComplaint(complaint);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Complaint> getComplaint(@PathVariable UUID id) {
        return service.getComplaintById(id);
    }
}

