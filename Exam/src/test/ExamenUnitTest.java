package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import model.Examen;

class ExamenUnitTest {

	@Test
	void instanciarExamen_InstanciaCompleta_ListaCalificacionesNoNula() {
		Examen unExamen = new Examen(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III",
				"Ingeniería en Sistemas");

		assertNotNull(unExamen.obtenerCalificaciones());
	}

}
