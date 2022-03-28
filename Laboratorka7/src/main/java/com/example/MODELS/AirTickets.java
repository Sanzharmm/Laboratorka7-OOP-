package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "AirTickets")
@AllArgsConstructor
@NoArgsConstructor
public class AirTickets {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "place")
    private String place;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "class_of_service")
    private ClassOfAirTickets classOfService;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_flights_id")
    private TourFlights tourFlights;

    @ManyToMany
    @JoinTable(name = "travelPackage_airTicket",
            joinColumns = @JoinColumn(name = "air_ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "travel_package_id"))
    private List<PackageOfTravel> travelPackageList;
}
