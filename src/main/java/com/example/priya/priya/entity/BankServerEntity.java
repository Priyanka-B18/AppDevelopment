package com.example.priya.priya.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "bank_servers")
public class BankServerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "server_id")
    private int serverId;
    @Column(name = "ip_address")
    private String ipAddress;
    @Column(name = "status")
    private String status;
    
    
    
}
