package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import model.Calificacion;
import model.Examen;
import model.Estudiante;

class CalificacionUnitTest {

	@Test
	void getResult_scoreTen_ReturnPERFECT() {
		Examen anExam = new Examen(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III", "Ingeniería en Sistemas");
		Estudiante aStudent = new Estudiante("123456", "Diaz", "Pedro", "Av. San Martín 25", "La Rioja");
		Calificacion aCalification = new Calificacion(aStudent, anExam, 10);

		String result = aCalification.getResult();

		assertEquals("SOBRESALIENTE", result);

	}

	@Test
	void getResult_scoreOffset_Error() {
		Examen anExam = new Examen(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III", "Ingeniería en Sistemas");
		Estudiante aStudent = new Estudiante("123456", "Diaz", "Pedro", "Av. San Martín 25", "La Rioja");
		Calificacion aCalification = new Calificacion(aStudent, anExam, 15);

		String result = aCalification.getResult();

		assertEquals("ERROR", result);

	}
	


}
