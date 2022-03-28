package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "events")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EVENTS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String place;
    @Column(name = "time of start")
    private Date startTime;
    @Column(name = "name of event")
    private String eventName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id of tour")
    private TOUR tour;
    @OneToMany(mappedBy = "events")
    private List<TicketsOfEvent> eventTicketsList;

}
