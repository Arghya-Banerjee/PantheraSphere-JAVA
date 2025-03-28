package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@Table(name = "ChecklistHeader")
public class ChecklistHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long checklistID;

    @ManyToOne
    @JoinColumn(name = "ForestID")
    private ForestMaster forest;

    @ManyToOne
    @JoinColumn(name = "CreatedBy")
    private UserMaster createdBy;

    private LocalDate safariDate;
    private Integer totalTigers;
    private LocalTime startTime;

    @ManyToOne
    @JoinColumn(name = "GuideID")
    private GuideMaster guide;

    @ManyToOne
    @JoinColumn(name = "DriverID")
    private DriverMaster driver;

    private Integer verified;
    private LocalDateTime modifiedAt;

    @OneToMany(mappedBy = "checklist")
    private List<ChecklistItem> checklistItems;
}
