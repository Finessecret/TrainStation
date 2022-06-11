package com.example.trainstation.logic.test;

import com.example.trainstation.logic.test.TestPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

public class TestController {
    @Autowired
    private TestPoint testPoint;

    @GetMapping("/test")
    void test() {
        try {
            testPoint.test();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
