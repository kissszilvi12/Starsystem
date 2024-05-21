package com.gerida.starsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/camper")
public class CamperController {
    @GetMapping("/{id}")
    public String camperById(@PathVariable String id) {
        return "Camper: "+id;
    }
}
