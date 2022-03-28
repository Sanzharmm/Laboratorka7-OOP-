package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
public class ORDER {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id of tour")
    private TOUR tour;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id of staff")
    private STAFF staff;
}
