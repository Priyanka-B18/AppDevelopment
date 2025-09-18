package com.example.priya.priya.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "card_details")
public class CardDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long cardId;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "expiry_date")
    private String expiryDate;
    @Column(name = "status")
    private String status;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "pin")
    private String pin;
    @Column(name = "account_id")
    private Long accountId;
    

}
