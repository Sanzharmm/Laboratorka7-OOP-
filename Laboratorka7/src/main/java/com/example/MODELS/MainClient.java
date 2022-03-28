package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MainClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Name")
    private String fullName;
    @Column(name = "address")
    private String address;
    @Column(name = "client's Number")
    private int clientNumber;
    @Column(name = "client's phoneNumber")
    private String clientPhoneNumber;

    @OneToMany(mappedBy = "client")
    private List<Contract> contractList;
}
