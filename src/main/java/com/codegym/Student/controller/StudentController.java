package com.codegym.Student.controller;

import com.codegym.Student.model.Department;
import com.codegym.Student.model.Student;
import com.codegym.Student.service.DepartmentService;
import com.codegym.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @ModelAttribute("department")
    public Iterable<Department> departments(){return departmentService.findAll();}
    @Autowired
    private StudentService studentService;
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/create-student")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("student", new Student());
        return modelAndView;
    }

    @PostMapping("/create-student")
    public ModelAndView createStudent(@ModelAttribute("student")Student student) {
        studentService.save(student);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("student", new Student());
        modelAndView.addObject("message", "Completed");
        return modelAndView;
    }

    @GetMapping("/student")
    public ModelAndView showStudent(Pageable pageable) {
        Page<Student> listStudent = studentService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("students", listStudent);
        return modelAndView;
    }
    @GetMapping("/edit-student/{id}")
    public ModelAndView formUpdateStudent(@PathVariable Long id){
        Student student = studentService.findById(id);
        if (student!=null){
            ModelAndView modelAndView = new ModelAndView("edit");
            modelAndView.addObject("student", student);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("error-404");
            return modelAndView;
        }
    }
    @PostMapping("/edit-student")
    public ModelAndView updateStudent(@ModelAttribute("student") Student student){
        studentService.save(student);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("student",student);
        modelAndView.addObject("message","Update Student");
        return modelAndView;
    }
}
