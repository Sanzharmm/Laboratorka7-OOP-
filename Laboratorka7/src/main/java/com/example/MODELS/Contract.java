package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="contract")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="registration's date")
    private Date registrationDate;
    @Column(name="contract's number")
    private long contractNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tour's id")
    private TOUR tour;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client's id")
    private MainClient client;

    @OneToOne(mappedBy = "contract")
    private PackageOfTravel travelPackage;




}
