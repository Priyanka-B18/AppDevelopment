package com.example.priya.priya.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "transactions")
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;
    @Column(name = "account_id")
    private Long accountId;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "transaction_type")
    private String transactionType;
    @Column(name = "status")
    private String status;
    
    
}
