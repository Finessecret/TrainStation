package com.example.trainstation.repositories;

import com.example.trainstation.model.entity.StationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<StationEntity, Integer> {
}
