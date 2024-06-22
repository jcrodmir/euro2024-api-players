package com.euro2024.teams.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "team")
@Data
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int foundation;
    private int championships;
    private String coach;

}
