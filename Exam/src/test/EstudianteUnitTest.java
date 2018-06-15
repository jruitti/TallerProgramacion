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
		Estudiante aStudent = new Estudiante();
		aStudent.apellido = "Perez";
		aStudent.nombre = "Juan";
		aStudent.matricula = "190001";

		assertEquals("Perez, Juan. (190001)", aStudent.mostrarDatos());
	}
	
	@Test
	void mostrarDomicilioCompleto_InstanciaDomicilio_MostrarFormateado() {
		
		Domicilio unDomicilio=new Domicilio("San Martín", 123, "La Rioja");
		String resultado=unDomicilio.mostrarDomicilioCompleto();
		
		assertEquals("San Martín 123 (La Rioja)", resultado);
	}
	
	@Test
	void mostrarDatos_InstanciaAsignatura_MostrarFormateado() {
		
		Asignatura unaAsignatura=new Asignatura("Programacion III","Ingenieria en Sistemas");
		String resultado=unaAsignatura.mostrarDatos();
		
		assertEquals("PROGRAMACION III - INGENIERIA EN SISTEMAS", resultado);
	}

}
