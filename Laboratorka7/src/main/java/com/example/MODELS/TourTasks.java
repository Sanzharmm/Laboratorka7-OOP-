package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "tour_tasks")
@AllArgsConstructor
@NoArgsConstructor
public class TourTasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String definition;
    @Column(name = "executing_time")
    private Date executingTime;
    private String status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_id")
    private TOUR tour;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_id")
    private STAFF staff;





}
