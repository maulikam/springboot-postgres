package com.springboot.example.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InternshipDTO {

    private int id;

    private String name;

    private String email;

    private String phone;

    private String address;

    private String city;

    private String state;


}
