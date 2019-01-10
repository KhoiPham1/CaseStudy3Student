package com.codegym.Student.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    private Long code;
    private String firstname;
    private String lastname;
    private String address;
    private Long phonenumber;
    private Long averagegrade;
    private Long status;
    private String email;
    private String note;
    private String description;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Long getAveragegrade() {
        return averagegrade;
    }

    public void setAveragegrade(Long averagegrade) {
        this.averagegrade = averagegrade;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student(Long code,String firstname, String lastname, String address, Long phonenumber, Long averagegrade, Long status, String email, String note, String description) {
        this.firstname = firstname;
        this.code = code;
        this.lastname = lastname;
        this.address = address;
        this.phonenumber = phonenumber;
        this.averagegrade = averagegrade;
        this.status = status;
        this.email = email;
        this.note = note;
        this.description = description;
    }

    public Student() {
    }
}
