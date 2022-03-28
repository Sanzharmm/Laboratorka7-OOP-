package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hotel_class")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClassOfHotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "class of hotel")
    private String hotel_class;
    @OneToMany(mappedBy = "hotelClass")
    private List<TheMainHotel> hotelList;
}
