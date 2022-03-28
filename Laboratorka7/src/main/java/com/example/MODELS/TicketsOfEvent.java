package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "event_tickets")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TicketsOfEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "number of place")
    private int place_number;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id of events")
    private EVENTS events;

    @ManyToMany
    @JoinTable(name = "travelPackage_eventTickets",
    joinColumns = @JoinColumn(name = "event_tickets_id"),
    inverseJoinColumns = @JoinColumn(name = "travel_package_id"))
    private List<PackageOfTravel> travelPackageList;



}
