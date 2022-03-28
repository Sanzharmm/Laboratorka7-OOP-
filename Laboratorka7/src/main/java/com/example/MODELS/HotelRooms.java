package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="hotel_rooms")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelRooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "check_in")
    private Date checkIn;
    @Column(name = "number of room")
    private int roomNumber;
    @Column(name = "check_out")
    private Date check_out;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category of id")
    private CategoryOfRoom roomCategory;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id of hotel")
    private TheMainHotel hotel;

    @ManyToMany
    @JoinTable(name = "hotelRooms_travelPackage",
    joinColumns = @JoinColumn(name = "hotel_room_id"),
    inverseJoinColumns = @JoinColumn(name = "travel_package_id"))
    private List<PackageOfTravel> travelPackageList;
}
