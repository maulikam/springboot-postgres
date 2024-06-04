package com.springboot.example.mapper;


import com.springboot.example.dto.InternshipDTO;
import com.springboot.example.entity.Intership;

import java.util.ArrayList;
import java.util.List;

public class InternshipMapper {

    public static InternshipDTO convertEntityToDTO(Intership entity){
        return InternshipDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .city(entity.getCity())
                .email(entity.getEmail())
                .state(entity.getState())
                .phone(entity.getPhone())
                .address(entity.getAddress())
                .build();
    }



    public static Intership convertDtoToEntity(InternshipDTO dto){
        return Intership.builder()
                .address(dto.getAddress())
                .name(dto.getName())
                .state(dto.getState())
                .phone(dto.getPhone())
                .email(dto.getEmail())
                .city(dto.getCity())
                .id(dto.getId()).build();
    }

    public static List<InternshipDTO> convertEntityListToDTOList(List<Intership> entities){
        List<InternshipDTO> dtoList = new ArrayList<InternshipDTO>();
        for(Intership entity: entities) {
            InternshipDTO dto = convertEntityToDTO(entity);
            dtoList.add(dto);
        }
        return dtoList;
    }

    public static List<Intership> convertDtoListToEntityList(List<InternshipDTO> dtos){
        List<Intership> entities = new ArrayList<Intership>();
        for(InternshipDTO dto: dtos) {
            Intership entity = convertDtoToEntity(dto);
            entities.add(entity);
        }
        return entities;
    }

}
