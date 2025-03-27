package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ChecklistItem")
public class ChecklistItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long checklistItemID;

    @ManyToOne
    @JoinColumn(name = "ChecklistID")
    private ChecklistHeader checklist;

    @ManyToOne
    @JoinColumn(name = "TigerID")
    private TigerMaster tiger;

    @ManyToOne
    @JoinColumn(name = "SeenBy")
    private UserMaster seenBy;

    private LocalDateTime seenTime;
    private String observationNotes;
}
