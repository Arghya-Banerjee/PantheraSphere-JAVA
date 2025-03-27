package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "DriverMaster")
public class DriverMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverID;

    private String name;
    private String gender;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

    @ManyToOne
    @JoinColumn(name = "CarID")
    private CarMaster car;

    @OneToMany(mappedBy = "driver")
    private List<DriverCarAssignment> carAssignments;

    @OneToMany(mappedBy = "driver")
    private List<ChecklistHeader> checklists;
}

