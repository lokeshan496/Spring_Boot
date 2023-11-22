package com.example.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StudentDetailsTest {
@InjectMocks
StudentDetails studentDetails;


	@Test
	void testStudentDetailsStringIntDouble() {
		studentDetails.setName("abc");
		studentDetails.setAge(25);
		studentDetails.setSalary(20000.0);
		studentDetails.getSalary(); 
	}

	@Test
	void testStudentDetails() {
		studentDetails.setName("abc");
		studentDetails.setAge(25);
		studentDetails.setSalary(20000.0);
		studentDetails.getClass();
	}

	@Test
	void testGetName() {
		studentDetails.getName();
	}
 

	@Test
	void testGetAge() {
		studentDetails.getAge();
	}


	@Test
	void testGetSalary() {
		studentDetails.getSalary();
	}

	 

	

}
