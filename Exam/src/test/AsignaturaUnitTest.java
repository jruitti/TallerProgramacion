package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignaturaUnitTest {

	@Test
	void mostrarDatos_InstanciaAsignatura_MostrarFormateado() {
		
		Asignatura unaAsignatura=new Asignatura("Programaci�n III","Ingenier�a en Sistemas");
		String resultado=unaAsignatura.mostrarDatos();
		
		assertEquals("PROGRAMACI�N III - INGENIER�A EN SISTEMAS", resultado);
	}

}
