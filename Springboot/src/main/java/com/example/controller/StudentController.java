package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StudentDetails;
import com.example.repository.StudentRepository;

@RestController	
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentDetails.class);
	
	@Autowired
	public StudentRepository studentRepository;
	
	@PostMapping("/addStudentDetails")
	public StudentDetails addStudentDetails(@RequestBody StudentDetails studentDetails) {
		logger.info("Adding student Details");
		 return studentRepository.save(studentDetails);
	
}
	@GetMapping("/getStudenmtDetails")
	
	public List<StudentDetails> getStudentDetails(@RequestBody StudentDetails studentDetails) {
		logger.info("Fetching all students");
		return studentRepository.findAll();
}
}
