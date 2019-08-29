package com.brayanrondonh.student.dao;

import com.brayanrondonh.student.dto.StudentM;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMRepositoryDaoInterface extends MongoRepository<StudentM, String>
{

}
