package com.gerida.starsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stars")
public class StarController {
    @GetMapping("/{id}")
    public String starById(@PathVariable String id) {
        return "Star: "+id;
    }
}
