package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "RoleMaster")
public class RoleMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleID;

    private String roleName;

    @OneToMany(mappedBy = "role")
    private List<UserMaster> users;
}
