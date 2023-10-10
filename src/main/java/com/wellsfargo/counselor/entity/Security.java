package com.wellsfargo.counselor.entity;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securityId;

    protected Security() {

    }

    public Security(String name, String category, int quantity, float purchasePrice, Date purchaseDate) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
    }

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

}
