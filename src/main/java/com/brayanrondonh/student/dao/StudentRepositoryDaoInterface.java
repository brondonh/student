package com.brayanrondonh.student.dao;

import com.brayanrondonh.student.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoryDaoInterface extends JpaRepository<Student, Integer> {}