package com.brayanrondonh.student.service;

import com.brayanrondonh.student.dto.Student;

import java.util.List;

public interface StudentServiceInterface
{
    public void insertStudent(Student student);
    public List<Student> findAllStudent();
    public void updateStudent(Student student);
    public void deleteStudentById(Integer id);
}
