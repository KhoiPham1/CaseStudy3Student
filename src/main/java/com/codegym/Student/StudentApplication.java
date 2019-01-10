package com.codegym.Student;

import com.codegym.Student.service.DepartmentService;
import com.codegym.Student.service.StudentService;
import com.codegym.Student.service.impl.DepartmentServiceImpl;
import com.codegym.Student.service.impl.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	@Bean public StudentService studentService(){ return new StudentServiceImpl(); }

	@Bean
	public DepartmentService departmentService(){return new DepartmentServiceImpl();
	}
}

