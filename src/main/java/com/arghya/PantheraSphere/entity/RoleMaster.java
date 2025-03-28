package com.arghya.PantheraSphere.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "RoleMaster")
public class RoleMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleID;

    private String roleName;

    @OneToMany(mappedBy = "role")
    @JsonBackReference
    private List<UserMaster> users;
}
