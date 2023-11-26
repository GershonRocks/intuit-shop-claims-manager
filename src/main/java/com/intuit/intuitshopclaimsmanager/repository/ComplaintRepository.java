package com.intuit.intuitshopclaimsmanager.repository;

import com.intuit.intuitshopclaimsmanager.model.Complaint;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ComplaintRepository extends JpaRepository<Complaint, UUID> {}

