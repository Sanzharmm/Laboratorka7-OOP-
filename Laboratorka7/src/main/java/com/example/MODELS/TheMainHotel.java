package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "hotel")
@Data@AllArgsConstructor
@NoArgsConstructor
public class TheMainHotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="town", columnDefinition = "varchar(35)")
    private String city;
    @Column(name="name", columnDefinition = "varchar(35)")
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "class of hotel")
    private ClassOfHotel hotelClass;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id of tour")
    private TOUR tour;




}
