package com.brayanrondonh.student.service;

import com.brayanrondonh.student.dto.StudentM;
import java.util.List;

public interface StudentMServiceInterface
{
    public StudentM insertByStudentM(StudentM studentM);
    public List<StudentM> findAllStudentM();
    public StudentM updateByStudentM(StudentM studentM);
    public void deleteByStudentM(String id);
}
