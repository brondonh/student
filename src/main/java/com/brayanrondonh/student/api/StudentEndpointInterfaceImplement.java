package com.brayanrondonh.student.api;

import com.brayanrondonh.student.dto.Student;
import com.brayanrondonh.student.service.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentEndpointInterfaceImplement implements StudentEndpointInterface
{
    @Autowired
    StudentServiceInterface studentServInter;

    @PostMapping
    public void insert(@RequestBody Student student)
    {
        studentServInter.insertStudent(student);
    }

    @GetMapping
    public List<Student> findAll()
    {
        return studentServInter.findAllStudent();
    }

    @PutMapping
    public void update(@RequestBody Student student)
    {
        studentServInter.updateStudent(student);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id)
    {
        studentServInter.deleteStudentById(id);
    }
}
