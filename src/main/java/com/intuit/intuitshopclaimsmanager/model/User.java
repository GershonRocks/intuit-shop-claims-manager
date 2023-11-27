package com.intuit.intuitshopclaimsmanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    private UUID id;
    private String fullName;
    private String emailAddress;
    private String physicalAddress;
}
