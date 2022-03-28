package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "staff")
@AllArgsConstructor
@NoArgsConstructor
public class STAFF {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fullName;
    private String passportNummer;
    private String address;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private POST position;

    @OneToOne(mappedBy = "staff")
    private TourTasks tourTasks;

    @OneToOne(mappedBy = "staff")
    private ORDER orders;

    public STAFF(String fullName, String passportNummer, String address) {
        this.fullName = fullName;
        this.passportNummer = passportNummer;
        this.address = address;
    }

    public STAFF(String fullName, String passportNummer, String address, POST position) {
        this.fullName = fullName;
        this.passportNummer = passportNummer;
        this.address = address;
        this.position = position;
    }

    public void setPost(POST post) {
        this.position=post;
    }
    public POST getPost(){
        return position;
    }
}
