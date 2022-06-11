package com.example.trainstation.repositories;

import com.example.trainstation.model.entity.ProblemEntity;
import com.example.trainstation.model.entity.RouteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRepository extends JpaRepository<ProblemEntity, Integer> {
}
