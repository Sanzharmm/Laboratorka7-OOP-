package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "tour")
@AllArgsConstructor
@NoArgsConstructor
public class TOUR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "number of tour")
    private int tourNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type of tour")
    private TypeOfTour tourType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country")
    private Land country;
    @Column(name = "date of start")
    private Date startDate;
    @Column(name = "date of end")
    private Date endDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="number of program")
    private TourProgram programNumber;

    @Column(name = "tour_name")
    private String tour_name;
    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY)
    private List<EVENTS> eventsList;

    @OneToOne(mappedBy = "tour")
    private TourTasks tourTasks;

    @OneToOne(mappedBy = "tour")
    private ORDER orders;

    @OneToMany(mappedBy = "tour")
    private List<TourFlights> tourFlightsList;

    @OneToMany(mappedBy = "tour")
    private List<TheMainHotel> hotelList;

    @OneToMany(mappedBy = "tour")
    private List<Contract> contractList;
}
