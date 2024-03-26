package com.example.SpringBootDeploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/sum")
public class SumController {
    @GetMapping
    public Integer sum() {
        Random random = new Random();
        Integer a = random.nextInt();
        Integer b = random.nextInt();
        return a + b;
    }
}
