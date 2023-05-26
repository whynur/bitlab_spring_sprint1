package com.example.bitlab_spring_sprint1.respository;

import com.example.bitlab_spring_sprint1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
