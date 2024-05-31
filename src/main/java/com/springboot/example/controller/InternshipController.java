package com.springboot.example.controller;


import com.springboot.example.entity.Intership;
import com.springboot.example.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/internships")
public class InternshipController {

    @Autowired
    private InternshipService internshipService;

    @GetMapping
    public List<Intership> getInternships() {
        return internshipService.getInterships();
    }

    @PostMapping
    public Intership createIntership(@RequestBody Intership intership) {
        return internshipService.createIntership(intership);
    }





}
