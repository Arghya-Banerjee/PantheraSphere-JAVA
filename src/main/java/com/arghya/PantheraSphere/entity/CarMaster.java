package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "CarMaster")
public class CarMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carID;

    private String carNumberPlate;
    private String carModel;

    @OneToMany(mappedBy = "car")
    private List<DriverMaster> drivers;

    @OneToMany(mappedBy = "car")
    private List<DriverCarAssignment> carAssignments;
}