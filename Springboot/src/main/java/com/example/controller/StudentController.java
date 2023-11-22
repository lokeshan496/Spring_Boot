package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StudentDetails;
import com.example.repository.StudentRepository;

@RestController	
public class StudentController {
	
	@Autowired
	public StudentRepository studentRepository;
	
	@PostMapping("/addStudentDetails")
	public StudentDetails addStudentDetails(@RequestBody StudentDetails studentDetails) {
		 return studentRepository.save(studentDetails);
	
}
	@GetMapping("/getStudenmtDetails")
	public List<StudentDetails> getStudentDetails(@RequestBody StudentDetails studentDetails) {
		 return studentRepository.findAll();
}
}
