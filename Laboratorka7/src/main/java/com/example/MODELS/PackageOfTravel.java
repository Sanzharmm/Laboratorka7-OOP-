package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "package of travel")
@AllArgsConstructor
@NoArgsConstructor
public class PackageOfTravel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "number of travel package")
    private int travelPackageNumber;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id of foreigner")
    private Foreigner tourist;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id of contract")
    private Contract contract;

    @ManyToMany
    @JoinTable(name = "travelPackage_airTicket",
    joinColumns = @JoinColumn(name = "id of travel package"),
    inverseJoinColumns = @JoinColumn(name = "id of air ticket"))
    private List<AirTickets> airTicketList;

    @ManyToMany
    @JoinTable(name = "hotelRooms_travelPackage",
            joinColumns = @JoinColumn(name = "id of travel package"),
            inverseJoinColumns = @JoinColumn(name = "id of travel room"))
    private List<HotelRooms> hotelRoomsList;

    @ManyToMany
    @JoinTable(name = "travelPackage_eventTickets",
            joinColumns = @JoinColumn(name = "id of travel package"),
            inverseJoinColumns = @JoinColumn(name = "id of event tickets"))
    private List<TicketsOfEvent> eventTicketsList;




}

