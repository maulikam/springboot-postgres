package com.springboot.example.controller;


import com.springboot.example.dto.InternshipDTO;
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
    public List<InternshipDTO> getInternships() {
        return internshipService.getInterships();
    }

    @PostMapping
    public InternshipDTO createIntership(@RequestBody InternshipDTO intership) {
        return internshipService.createIntership(intership);
    }

    @GetMapping("/{id}")
    public InternshipDTO getInternshipById(@PathVariable int id) {
        return internshipService.getInternshipById(id);
    }

    @GetMapping("/name/{name}")
    public InternshipDTO getInternshipByName(@PathVariable String name) {
        return internshipService.getInternshipByName(name);
    }



}
