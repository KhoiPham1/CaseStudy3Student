package com.codegym.Student.service;

import com.codegym.Student.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
    Page<Student>findAll(Pageable pageable);

    Student findById(Long id);

    void save(Student student);

    void delete(Long id);
}
