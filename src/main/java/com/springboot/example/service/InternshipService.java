package com.springboot.example.service;


import com.springboot.example.dto.InternshipDTO;
import com.springboot.example.entity.Intership;
import com.springboot.example.mapper.InternshipMapper;
import com.springboot.example.repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {


    @Autowired
    InternRepository internRepository;

    public List<InternshipDTO> getInterships() {
        List<Intership> interships = internRepository.findAll();
        List<InternshipDTO> dtos = InternshipMapper.convertEntityListToDTOList(interships);
        return dtos;
    }

    public InternshipDTO getIntershipById(int id) {
        Intership intership = internRepository.findById(id).get();
        InternshipDTO dto = InternshipMapper.convertEntityToDTO(intership);
        return dto;
    }

    public InternshipDTO createIntership(InternshipDTO dto) {
        Intership intership = InternshipMapper.convertDtoToEntity(dto);
        Intership savedInternship = internRepository.save(intership);
        return InternshipMapper.convertEntityToDTO(savedInternship);
    }


    public InternshipDTO getInternshipById(int id) {
        Intership intership = internRepository.findById(id).get();
        return InternshipMapper.convertEntityToDTO(intership);
    }

    public InternshipDTO getInternshipByName(String name) {
        Intership intership = internRepository.getIntershipByName(name).get();
        return InternshipMapper.convertEntityToDTO(intership);
    }
}
