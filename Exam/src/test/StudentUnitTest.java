package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Student;

class StudentUnitTest {

	@Test
	void examCreation_SetAttributes_Succesfull() {
		Student aStudent = new Student();
		aStudent.surname = "Perez";
		aStudent.name = "Juan";

		assertEquals("Perez", aStudent.surname);

	}

	@Test
	void showDetails_StudentInstance_ReturnFormatted() {
		Student aStudent = new Student();
		aStudent.surname = "Perez";
		aStudent.name = "Juan";
		aStudent.enrollment = "190001";

		assertEquals("Perez, Juan. (190001)", aStudent.showDetails());
	}

}
