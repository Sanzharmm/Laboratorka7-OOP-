package com.example.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "post")
@Data
@AllArgsConstructor
public class POST {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String post;
    private int salary;
    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<STAFF> staffList;

    public POST(String post, int salary) {
        this.post = post;
        this.salary = salary;
        staffList = new ArrayList<STAFF>();
    }
    public POST() {
    }

    public void addStaff(STAFF staff) {
        staff.setPost(this);
        staffList.add(staff);
    }

    public void removeStaff(STAFF staff) {
        staffList.remove(staff);
    }
}
