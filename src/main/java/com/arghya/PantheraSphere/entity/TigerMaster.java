package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "TigerMaster")
public class TigerMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tigerID;

    private String name;
    private char gender;
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "ResidentForestID")
    private ForestMaster residentForest;

    private LocalDateTime lastSighted;

    @ManyToOne
    @JoinColumn(name = "AddedBy")
    private UserMaster addedBy;

    private LocalDateTime addedDate;
    private LocalDateTime modifiedAt;

    @OneToMany(mappedBy = "tiger")
    private List<ChecklistItem> sightings;
}
