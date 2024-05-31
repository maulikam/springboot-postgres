package com.springboot.example.service;


import com.springboot.example.entity.Intership;
import com.springboot.example.repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {


    @Autowired
    InternRepository internRepository;

    public List<Intership> getInterships() {
        return internRepository.findAll();
    }

    public Intership getIntershipById(int id) {
        return internRepository.findById(id).get();
    }

    public Intership createIntership(Intership intership) {
        return internRepository.save(intership);
    }



}
