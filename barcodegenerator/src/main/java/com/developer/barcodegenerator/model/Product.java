package com.developer.barcodegenerator.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String productName;
    private int amount;
    private Double price;
    private String batch;
    @Column(columnDefinition = "TEXT")
    private String description;
}
