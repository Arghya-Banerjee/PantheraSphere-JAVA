package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "GuideMaster")
public class GuideMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guideID;

    private String name;
    private String gender;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

    @OneToMany(mappedBy = "guide")
    private List<ChecklistHeader> checklists;
}
