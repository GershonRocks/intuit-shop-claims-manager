package com.intuit.intuitshopclaimsmanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.UUID;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Data
@Table(name = "purchases")
public class Purchase {
    @Id
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
    private UUID productId;
    private String productName;
    private BigDecimal pricePaidAmount;
    private String priceCurrency;
    @Column(name = "discount_percent", nullable = false)
    private float discountPercent = 0.0f;
    private UUID merchantId;
    private ZonedDateTime purchaseDate;
}

