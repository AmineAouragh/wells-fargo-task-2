package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

import javax.annotation.processing.Generated;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

}
