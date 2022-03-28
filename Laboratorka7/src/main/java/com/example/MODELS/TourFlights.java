package com.example.MODELS;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tour_flight")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourFlights {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "Code of flights")
    private int flightCode;
    @Column(name = "airline")
    private String airline;
    @Column(name = "date of departure")
    private Date departureDate;
    @Column(name = "time of departure")
    private Date departureTime;
    @Column(name = "arrival of city")
    private String cityOfArrival;
    @Column(name = "departure of city")
    private String departureCity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id of tour")
    private TOUR tour;




}
