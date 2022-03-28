package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tourist")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Foreigner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long id;
    @Column(name = "tourist_passport_number")
    private long touristPassportNumber;
    @Column(name = "full of name")
    private String fullName;
    @Column(name = "age of foreigner")
    private int touristAge;
    @Column(name = "address")
    private String address;
    @OneToOne(mappedBy = "tourist")
    private PackageOfTravel travelPackage;
}
