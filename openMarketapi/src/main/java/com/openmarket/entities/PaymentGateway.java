package com.openmarket.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PaymentGateway")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentGateway {

    @SequenceGenerator(name = "admin_sequence_generator", allocationSize = 1, initialValue = 3030)
    @Id
    @GeneratedValue(generator = "admin_sequence_generator", strategy = GenerationType.SEQUENCE)
    @Column(name = "paymentId")
    private Integer paymentId;

    private String PaymentType;
}
