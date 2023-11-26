package com.intuit.intuitshopclaimsmanager.repository;

import com.intuit.intuitshopclaimsmanager.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PurchaseRepository extends JpaRepository<Purchase, UUID> {}

