package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.StudentDetails;
@Repository
public interface StudentRepository extends MongoRepository<StudentDetails, String> {
	
	

}
	