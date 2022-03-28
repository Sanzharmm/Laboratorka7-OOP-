package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room_category")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryOfRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long id;
    @Column(name = "category")
    private String roomCategory;
    @OneToMany(mappedBy = "roomCategory")
    private List<HotelRooms> hotelList;
}
