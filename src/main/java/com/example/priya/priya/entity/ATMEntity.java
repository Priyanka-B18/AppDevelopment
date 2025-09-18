package com.example.priya.priya.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name = "atms")
public class ATMEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atm_id")
    private Long atmId;
    @Column(name = "location")
    private String location;
    @Column(name = "status")
    private String status;
    @Column(name = "server_id")
    private int serverId;

    
}
