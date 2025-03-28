package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "UserMaster")
public class UserMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    private String username;
    private String email;
    private String passCode;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "RoleID")
    private RoleMaster role;

    @OneToMany(mappedBy = "createdBy")
    private List<ChecklistHeader> createdChecklists;

    @OneToMany(mappedBy = "seenBy")
    private List<ChecklistItem> sightings;

    @OneToMany(mappedBy = "addedBy")
    private List<TigerMaster> addedTigers;
}