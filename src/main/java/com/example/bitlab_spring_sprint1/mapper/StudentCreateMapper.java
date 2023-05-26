package com.example.bitlab_spring_sprint1.mapper;


import com.example.bitlab_spring_sprint1.dto.StudentCreateDto;
import com.example.bitlab_spring_sprint1.entity.Student;
import com.example.bitlab_spring_sprint1.util.MarkConverter;
import org.springframework.stereotype.Component;

@Component
public class StudentCreateMapper implements Mapper<StudentCreateDto, Student>{

    @Override
    public Student map(StudentCreateDto object) {
        return Student.builder()
                .name(object.getName())
                .surname(object.getSurname())
                .exam(object.getExam())
                .mark(MarkConverter.createMark(object.getExam()))
                .build();
    }
}
