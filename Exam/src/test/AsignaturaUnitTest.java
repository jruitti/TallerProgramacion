package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignaturaUnitTest {

	@Test
	void mostrarDatos_InstanciaAsignatura_MostrarFormateado() {
		
		Asignatura unaAsignatura=new Asignatura("Programacion III","Ingenieria en Sistemas");
		String resultado=unaAsignatura.mostrarDatos();
		
		assertEquals("PROGRAMACION III - INGENIERIA EN SISTEMAS", resultado);
	}

}
