package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import model.Calificacion;
import model.Examen;
import model.Estudiante;

class CalificacionUnitTest {

	@Test
	void getResultado_NotaDiez_RetornaSobresaliente() {
		Examen unExamen = new Examen(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III", "Ingeniería en Sistemas");
		Estudiante unEstudiante = new Estudiante("123456", "Diaz", "Pedro", "Av. San Martín 25", "La Rioja");
		Calificacion unaCalificacion = new Calificacion(unEstudiante, unExamen, 10);

		String resultado = unaCalificacion.getResultado();

		assertEquals("SOBRESALIENTE", resultado);

	}

	@Test
	void getResultado_NotaSuperiorADiez_DevuelveError() {
		Examen unExamen = new Examen(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III", "Ingeniería en Sistemas");
		Estudiante unEstudiante = new Estudiante("123456", "Diaz", "Pedro", "Av. San Martín 25", "La Rioja");
		Calificacion unaCalificacion = new Calificacion(unEstudiante, unExamen, 15);

		String resultado = unaCalificacion.getResultado();

		assertEquals("ERROR", resultado);

	}
	
	@Test
	void getResultado_NotaInferiorAUno_DevuelveError() {
		Examen unExamen = new Examen(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III", "Ingeniería en Sistemas");
		Estudiante unEstudiante = new Estudiante("123456", "Diaz", "Pedro", "Av. San Martín 25", "La Rioja");
		Calificacion unaCalificacion = new Calificacion(unEstudiante, unExamen, 0);

		String resultado = unaCalificacion.getResultado();

		assertEquals("ERROR", resultado);

	}
	


}
