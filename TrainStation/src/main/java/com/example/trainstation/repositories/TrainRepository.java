package com.example.trainstation.repositories;

import com.example.trainstation.model.entity.TrainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<TrainEntity, Integer> {
}
