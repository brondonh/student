package com.brayanrondonh.student.dao;

import com.brayanrondonh.student.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepositoryDaoInterface extends JpaRepository<Student, Integer>
{
    public List<Student> findByfirstName(String firstName);
    public List<Student> findByBirthdate(LocalDate birthdate);
    public List<Student> findBydni(String dni);
    public List<Student> findByemail(String email);
}