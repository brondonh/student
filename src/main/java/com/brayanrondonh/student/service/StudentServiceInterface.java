package com.brayanrondonh.student.service;

import com.brayanrondonh.student.dto.Student;

import java.time.LocalDate;
import java.util.List;

public interface StudentServiceInterface
{
    public void insertStudent(Student student);
    public List<Student> findAllStudent();
    public List<Student> findByfirstName(String firstName);
    public List<Student> findBybirthdate(LocalDate birthdate);
    public List<Student> findBydni(String dni);
    public List<Student> findByemail(String email);
    public void updateStudent(Student student);
    public void deleteStudentById(Integer id);
}
