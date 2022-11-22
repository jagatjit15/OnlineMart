package com.openmarket.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "orders_data")
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @SequenceGenerator(name = "admin_sequence_generator", allocationSize = 1, initialValue = 1000)
    @Id
    @GeneratedValue(generator = "admin_sequence_generator", strategy = GenerationType.SEQUENCE)
    @Column(name = "orderId")
    private Long orderId;

    private Long customerId;

    private Long paymentId;

    private Long shipperId;

    private LocalDate orderDate;
    private LocalDate shipDate;
    private LocalDate deliveryDate;
    private Long totalAmount;
}
