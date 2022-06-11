package com.example.trainstation.model.entity;

import org.apache.tomcat.jni.Time;

import javax.persistence.*;
import java.util.Set;

public class ProblemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "problem_id")
    private Long id;
    private String problemType;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "route_id", nullable = false)
    private RouteEntity route;
    private Time startDataTime;
    private Time endDataTime;
}
