package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Estudiante;

class EstudianteUnitTest {

	@Test
	void instanciarEstudiante_asignarAtributos_asignacionExitosa() {
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.apellido = "Perez";
		unEstudiante.nombre = "Juan";

		assertEquals("Perez", unEstudiante.apellido);

	}

	@Test
	void mostrarDatos_EstudianteCompleto_MostrarFormateado() {
		Estudiante e = new Estudiante();
		e.apellido = "Perez";
		e.nombre = "Juan";
		e.matricula = "190001";

		assertEquals("Perez, Juan. (190001)", e.mostrarDatos());
	}
	

	


}
