package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import model.Exam;

class ExamUnitTest {

	@Test
	void examCreation_ListCalification_NotEmpty() {
		Exam anExam = new Exam(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III", "Ingeniería en Sistemas");

		assertNotNull(anExam.getScores());
	}
}
