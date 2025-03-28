package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "ForestTypeMaster")
public class ForestTypeMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long forestTypeID;

    private String forestTypeName;
    private String description;

    @OneToMany(mappedBy = "forestType")
    private List<ForestMaster> forests;
}
