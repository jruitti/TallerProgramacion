package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DomicilioUnitTest {

	@Test
	void mostrarDomicilioCompleto_InstanciaDomicilio_MostrarFormateado() {
		
		Domicilio unDomicilio=new Domicilio("San Martín", 123, "La Rioja");
		String resultado=unDomicilio.mostrarDomicilioCompleto();
		
		assertEquals("San Martín 123 (La Rioja)", resultado);
	}

}
