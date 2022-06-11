package com.example.trainstation.controller;

import com.example.trainstation.model.entity.RouteEntity;
import com.example.trainstation.repositories.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/route")
public class RouteController {
    @Autowired
    private RouteRepository routeRepository;

    @GetMapping("/get_all")
    public List<RouteEntity> getAllRoutes() {
        return routeRepository.findAll();
    }

    @PostMapping("/save")
    public RouteEntity saveRoute(@RequestBody RouteEntity order) {
        return routeRepository.save(order);
    }
}
