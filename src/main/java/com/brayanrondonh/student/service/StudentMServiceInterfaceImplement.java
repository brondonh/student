package com.brayanrondonh.student.service;

import com.brayanrondonh.student.dao.StudentMRepositoryDaoInterface;
import com.brayanrondonh.student.dto.StudentM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentMServiceInterfaceImplement implements StudentMServiceInterface
{
    @Autowired
    StudentMRepositoryDaoInterface dao2;

    public StudentM insertByStudentM(StudentM studentM)
    {
        return dao2.save(studentM);
    }

    public List<StudentM> findAllStudentM()
    {
        return dao2.findAll();
    }

    public StudentM updateByStudentM(StudentM studentM)
    {
        return dao2.save(studentM);
    }

    public void deleteByStudentM(String id)
    {
        dao2.deleteById(id);
    }
}
