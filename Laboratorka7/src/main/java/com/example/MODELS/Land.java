package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "country")
@AllArgsConstructor
@NoArgsConstructor
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    private Collection<TOUR> tours;
}
