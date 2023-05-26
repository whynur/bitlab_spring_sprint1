package com.example.bitlab_spring_sprint1.dto;

import lombok.Value;

@Value
public class StudentCreateDto {
    String name;
    String surname;
    Integer exam;
}
