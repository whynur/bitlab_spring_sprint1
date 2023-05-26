package com.example.bitlab_spring_sprint1.controller;

import com.example.bitlab_spring_sprint1.dto.StudentCreateDto;
import com.example.bitlab_spring_sprint1.dto.StudentReadDto;
import com.example.bitlab_spring_sprint1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/")
    public String findAll(Model model) {
        List<StudentReadDto> students = studentService.findAll();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping("/add-student")
    public String createPage() {
        return "add_student";
    }

    @PostMapping("/add-student")
    public String create(StudentCreateDto student) {
        studentService.create(student);
        return "redirect:/";
    }

}
