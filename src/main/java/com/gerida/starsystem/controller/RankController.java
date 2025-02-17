package com.gerida.starsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rank")
public class RankController {
    @GetMapping("/{id}")
    public String rankById(@PathVariable String id) {
        return "Rank: "+id;
    }
}
