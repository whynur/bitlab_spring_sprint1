package com.example.bitlab_spring_sprint1.service;



import com.example.bitlab_spring_sprint1.dto.StudentCreateDto;
import com.example.bitlab_spring_sprint1.dto.StudentReadDto;

import java.util.List;

public interface StudentService {

    public List<StudentReadDto> findAll();

    public void create(StudentCreateDto student);
}
