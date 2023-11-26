package com.intuit.intuitshopclaimsmanager.repository;

import com.intuit.intuitshopclaimsmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {}

