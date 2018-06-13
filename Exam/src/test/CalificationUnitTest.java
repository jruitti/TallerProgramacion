package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import model.Calification;
import model.Exam;
import model.Student;

class CalificationUnitTest {

	@Test
	void getResult_scoreTen_PassWithMerit() {
		Exam anExam = new Exam(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III", "Ingeniería en Sistemas");
		Student aStudent = new Student("123456", "Diaz", "Pedro", "Av. San Martín 25", "La Rioja");
		Calification aCalification = new Calification(aStudent, anExam, 10);

		String result = aCalification.getResult();

		assertEquals("PASS WITH MERIT", result);

	}

	@Test
	void getResult_scoreOffset_Error() {
		Exam anExam = new Exam(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III", "Ingeniería en Sistemas");
		Student aStudent = new Student("123456", "Diaz", "Pedro", "Av. San Martín 25", "La Rioja");
		Calification aCalification = new Calification(aStudent, anExam, 15);

		String result = aCalification.getResult();

		assertEquals("ERROR", result);

	}

}
