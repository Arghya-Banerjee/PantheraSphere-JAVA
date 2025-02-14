package com.arghya.PantheraSphere.model;

import com.arghya.PantheraSphere.dto.RoleDto;
import jakarta.persistence.*;

@Entity
public class RootEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
}
