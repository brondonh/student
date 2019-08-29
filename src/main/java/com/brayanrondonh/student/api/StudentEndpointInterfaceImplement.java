package com.brayanrondonh.student.api;

import com.brayanrondonh.student.dto.Student;
import com.brayanrondonh.student.service.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentEndpointInterfaceImplement
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

    @GetMapping(value = "/name/{firstName}")
    public List<Student> findFirstName(@PathVariable(value = "firstName") String firstName)
    {
        return studentServInter.findByfirstName(firstName);
    }

    @GetMapping(value = "/date/{birthdate}")
    public List<Student> findBirthDate(@PathVariable(value = "birthdate") LocalDate birthdate)
    {
        return studentServInter.findBybirthdate(birthdate);
    }

    @GetMapping(value = "/dni/{dni}")
    public List<Student> findDni(@PathVariable(value = "dni") String dni)
    {
        return studentServInter.findBydni(dni);
    }

    @GetMapping(value = "/email/{email}")
    public List<Student> findEmail(@PathVariable(value = "email") String email)
    {
        return studentServInter.findByemail(email);
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
