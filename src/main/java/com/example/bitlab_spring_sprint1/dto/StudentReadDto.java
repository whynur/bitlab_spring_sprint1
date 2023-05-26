package com.example.bitlab_spring_sprint1.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class StudentReadDto {
    Long id;
    String name;
    String surname;
    Integer exam;
    String mark;
}
