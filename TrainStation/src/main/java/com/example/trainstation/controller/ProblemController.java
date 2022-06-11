package com.example.trainstation.controller;

import com.example.trainstation.model.entity.ProblemEntity;
import com.example.trainstation.repositories.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/route")
public class ProblemController {
    @Autowired
    private ProblemRepository problemRepository;

    @GetMapping("/get_all")
    public List<ProblemEntity> getAllProblems() {
        return problemRepository.findAll();
    }

    @PostMapping("/save")
    public ProblemEntity saveProblem(@RequestBody ProblemEntity problem) {
        return problemRepository.save(problem);
    }
}
