package com.example.bitlab_spring_sprint1.mapper;


import com.example.bitlab_spring_sprint1.dto.StudentReadDto;
import com.example.bitlab_spring_sprint1.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentReadMapper implements Mapper<Student, StudentReadDto>{
    @Override
    public StudentReadDto map(Student object) {
        return StudentReadDto.builder()
                .id(object.getId())
                .name(object.getName())
                .surname(object.getSurname())
                .exam(object.getExam())
                .mark(object.getMark())
                .build();
    }
}
