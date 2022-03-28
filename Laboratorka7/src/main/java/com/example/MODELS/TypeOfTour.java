package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "tour_type")
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfTour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @OneToMany(mappedBy = "tourType", fetch=FetchType.EAGER)
    private Collection<TOUR> tourType;
}
