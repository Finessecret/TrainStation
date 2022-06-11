package com.example.trainstation.controller;

import com.example.trainstation.model.entity.TrainEntity;
import com.example.trainstation.repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/train")
public class TrainController {
    @Autowired
    private TrainRepository trainRepository;

    @GetMapping("/get_all")
    public List<TrainEntity> getAllTrains() {
        return trainRepository.findAll();
    }

    @PostMapping("/save")
    public TrainEntity saveStaton(@RequestBody TrainEntity station) {
        return trainRepository.save(station);
    }

}
