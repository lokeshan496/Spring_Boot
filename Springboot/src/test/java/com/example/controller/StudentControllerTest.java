package com.example.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.model.StudentDetails;
import com.example.repository.StudentRepository;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {
	
	@InjectMocks
	StudentController studentController;
	
	@Mock
	private StudentRepository studentRepository;
	
	 StudentDetails studentDetails=new StudentDetails();
	@Test
	void addStudentTest()
	{
		studentDetails.setName("abc");
		studentDetails.setAge(25);
		studentDetails.setSalary(20000.0);
		studentController.addStudentDetails(studentDetails);
		
	}
	
	@Test
	void getStudentTest()
	{
		studentController.getStudentDetails(studentDetails);
	}

}
