package com.gerida.starsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/star-type")
public class StarTypeController {
    @GetMapping("/{id}")
    public String typeById(@PathVariable String id) {
        return "Type: "+id;
    }
}
