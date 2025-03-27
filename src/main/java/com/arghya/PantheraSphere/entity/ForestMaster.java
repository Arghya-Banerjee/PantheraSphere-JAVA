package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ForestMaster")
public class ForestMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long forestID;

    private String forestName;
    private Double forestArea;
    private String state;

    @ManyToOne
    @JoinColumn(name = "ForestTypeID")
    private ForestTypeMaster forestType;

    @OneToMany(mappedBy = "forest")
    private List<ChecklistHeader> checklists;

    @OneToMany(mappedBy = "residentForest")
    private List<TigerMaster> tigers;
}
