package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //Auto-Increament
    private Long id;

    @Column
    private String name;

    @Column
    private Integer price;

    @Builder
    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
