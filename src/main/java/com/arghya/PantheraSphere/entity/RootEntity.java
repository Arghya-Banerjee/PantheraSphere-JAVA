package com.arghya.PantheraSphere.entity;

import jakarta.persistence.*;

@Entity
public class RootEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
}
