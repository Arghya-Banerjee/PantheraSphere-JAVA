package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "DriverCarAssignment")
public class DriverCarAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assignmentID;

    @ManyToOne
    @JoinColumn(name = "DriverID")
    private DriverMaster driver;

    @ManyToOne
    @JoinColumn(name = "CarID")
    private CarMaster car;

    private LocalDateTime assignedFrom;
    private LocalDateTime assignedTill;
}
