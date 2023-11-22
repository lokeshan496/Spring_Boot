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
public void testStudentDetailsConstructor() {
    // Arrange
    String expectedName = "John Doe";
    int expectedAge = 25;
    Double expectedSalary = 50000.0;

    // Act
    StudentDetails student = new StudentDetails(expectedName, expectedAge, expectedSalary);

    // Assert
    assertEquals(expectedName, student.getName());
    assertEquals(expectedAge, student.getAge());
    assertEquals(expectedSalary, student.getSalary());
}

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
	void testSetName() {
		studentDetails.setName("Loki");
	}
	@Test
	void testGetName() {
		studentDetails.getName();
	}
 
	@Test
	void testSetAge() {
		studentDetails.setAge(23);
	}
	@Test
	void testGetAge() {
		studentDetails.getAge();
	}

	@Test
	void testSetSalary() {
		studentDetails.setSalary(28000.0);
	}
	@Test
	void testGetSalary() {
		studentDetails.getSalary();
	}

	 

}
