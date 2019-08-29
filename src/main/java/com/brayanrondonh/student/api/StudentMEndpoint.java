package com.brayanrondonh.student.api;

import com.brayanrondonh.student.dto.StudentM;
import com.brayanrondonh.student.service.StudentMServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/studentM")
public class StudentMEndpoint
{
    @Autowired
    StudentMServiceInterface serv;

    @PostMapping
    public StudentM insert(@RequestBody StudentM studentM)
    {
        return serv.insertByStudentM(studentM);
    }

    @GetMapping
    public List<StudentM> findAll()
    {
        return serv.findAllStudentM();
    }

    @PutMapping
    public StudentM update(@RequestBody StudentM studentM)
    {
        return serv.updateByStudentM(studentM);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(value = "id") String id)
    {
        serv.deleteByStudentM(id);
    }
}
