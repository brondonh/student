package com.brayanrondonh.student.service;

import com.brayanrondonh.student.dao.StudentRepositoryDaoInterface;
import com.brayanrondonh.student.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    @Override
    public List<Student> findAllStudent()
    {
        return dao.findAll();
    }

    @Override
    public List<Student> findByfirstName(String firstName)
    {
        return dao.findByfirstName(firstName);
    }

    @Override
    public List<Student> findBybirthdate(LocalDate birthdate)
    {
        return dao.findByBirthdate(birthdate);
    }

    @Override
    public List<Student> findBydni(String dni)
    {
        return dao.findBydni(dni);
    }

    @Override
    public List<Student> findByemail(String email)
    {
        return dao.findByemail(email);
    }

    @Override
    public void updateStudent(Student student)
    {
        dao.save(student);
    }

    @Override
    public void deleteStudentById(Integer id)
    {
        dao.deleteById(id);
    }
}