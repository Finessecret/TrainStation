package com.example.trainstation.model.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class TrainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "train_id")
    private Long id;
}
