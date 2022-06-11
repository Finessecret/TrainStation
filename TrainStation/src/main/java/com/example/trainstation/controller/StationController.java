package com.example.trainstation.controller;

import com.example.trainstation.model.entity.StationEntity;
import com.example.trainstation.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/station")
public class StationController {
    @Autowired
    private StationRepository stationRepository;

    @GetMapping("/get_all")
    public List<StationEntity> getAllStations() {
        return stationRepository.findAll();
    }

    @PostMapping("/save")
    public StationEntity saveStaton(@RequestBody StationEntity station) {
        return stationRepository.save(station);
    }

}
