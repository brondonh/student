package com.brayanrondonh.student.api;

import com.brayanrondonh.student.dto.Student;

import java.util.List;

public interface StudentEndpointInterface
{
    public void insert(Student student);
    public List<Student> findAll();
    public void update(Student student);
    public void delete(Integer id);
}
