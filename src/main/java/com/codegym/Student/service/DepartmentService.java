package com.codegym.Student.service;

import com.codegym.Student.model.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DepartmentService {
    Iterable<Department> findAll();

    Department findById(Long id);


}
