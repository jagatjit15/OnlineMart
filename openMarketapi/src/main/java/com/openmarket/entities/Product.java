package com.openmarket.entities;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public class Product {

    @SequenceGenerator(name = "admin_sequence_generator", allocationSize = 1, initialValue = 1)
    @Id
    @GeneratedValue(generator = "admin_sequence_generator", strategy = GenerationType.SEQUENCE)
    @Column(name = "productId")
    private Long productId;

}
