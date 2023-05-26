package com.example.bitlab_spring_sprint1.service;


import com.example.bitlab_spring_sprint1.dto.StudentCreateDto;
import com.example.bitlab_spring_sprint1.dto.StudentReadDto;
import com.example.bitlab_spring_sprint1.mapper.StudentCreateMapper;
import com.example.bitlab_spring_sprint1.mapper.StudentReadMapper;
import com.example.bitlab_spring_sprint1.respository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentReadMapper studentReadMapper;
    private final StudentCreateMapper studentCreateMapper;

    public List<StudentReadDto> findAll() {
        return studentRepository.findAll().stream()
                .map(studentReadMapper::map)
                .toList();
    }

    public void create(StudentCreateDto student) {
        Optional.of(student)
                .map(studentCreateMapper::map)
                .map(studentRepository::save)
                .orElseThrow();
    }
}
