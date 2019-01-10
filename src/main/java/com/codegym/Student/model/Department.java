package com.codegym.Student.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department_id")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(targetEntity = Student.class)
    private List<Student>students;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Department() {
    }

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private String description;
}
