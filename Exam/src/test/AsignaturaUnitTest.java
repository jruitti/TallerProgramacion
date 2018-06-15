package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignaturaUnitTest {

	@Test
	void mostrarDatos_InstanciaAsignatura_MostrarFormateado() {
		
		Asignatura unaAsignatura=new Asignatura("Programación III","Ingeniería en Sistemas");
		String resultado=unaAsignatura.mostrarDatos();
		
		assertEquals("PROGRAMACIÓN III - INGENIERÍA EN SISTEMAS", resultado);
	}

}
