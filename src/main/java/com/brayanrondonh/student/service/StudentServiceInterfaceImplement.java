package com.brayanrondonh.student.service;

import com.brayanrondonh.student.dao.StudentRepositoryDaoInterface;
import com.brayanrondonh.student.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceInterfaceImplement implements StudentServiceInterface
{
    @Autowired
    StudentRepositoryDaoInterface dao;

    @Override
    public void insertStudent(Student student)
    {
        dao.save(student);
    }

    public List<Student> findAllStudent()
    {
        return dao.findAll();
    }

    public void updateStudent(Student student)
    {
        dao.save(student);
    }

    public void deleteStudentById(Integer id)
    {
        dao.deleteById(id);
    }
}