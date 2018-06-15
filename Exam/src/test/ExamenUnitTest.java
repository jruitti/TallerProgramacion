package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import model.Calificacion;
import model.Examen;
import model.Estudiante;

class ExamenUnitTest {

	@Test
	void instanciarExamen_InstanciaCompleta_ListaCalificacionesNoNula() {
		Examen unExamen = new Examen(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III","Ingeniería en Sistemas");

		assertNotNull(unExamen.obtenerCalificaciones());
	}

	@Test
	void obtenerAprobados_ExamenCompleto_RetornarTresAprobados() {
		Examen unExamen = new Examen(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III","Ingeniería en Sistemas");

		Estudiante estudiante1 = new Estudiante("190001", "Diaz", "Pedro", "Av. San Martín 25", "La Rioja");
		Estudiante estudiante2 = new Estudiante("190002", "Lopez", "Pedro", "Av. Facundo Quiroga 25", "La Rioja");
		Estudiante estudiante3 = new Estudiante("190003", "Perez", "Pedro", "Av. Belgrano 25", "La Rioja");
		Estudiante estudiante4 = new Estudiante("190004", "Martinez", "Pedro", "Av. Castro Barros 25", "La Rioja");

		Calificacion calificacionEstudiante1 = new Calificacion(estudiante1, unExamen, 3);
		Calificacion calificacionEstudiante2 = new Calificacion(estudiante2, unExamen, 8);
		Calificacion calificacionEstudiante3 = new Calificacion(estudiante3, unExamen, 10);
		Calificacion calificacionEstudiante4 = new Calificacion(estudiante4, unExamen, 7);

		Collection<Calificacion> calificaciones = new LinkedList<Calificacion>();
		calificaciones.add(calificacionEstudiante1);
		calificaciones.add(calificacionEstudiante2);
		calificaciones.add(calificacionEstudiante3);
		calificaciones.add(calificacionEstudiante4);

		unExamen.setCalificaciones(calificaciones);

		LinkedList<Calificacion> resultado = unExamen.obtenerAprobados();

		assertEquals("Lopez, Pedro -> 8 (APROBADO)", resultado.get(0).obtenerNotaEstudiante());
		assertEquals(3, resultado.size());

	}

	@Test
	void obtenerMejorNota_ExamenCompleto_RetornarNotaMasAlta() {
		Examen unExamen = new Examen(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III","Ingeniería en Sistemas");

		Estudiante estudiante1 = new Estudiante("190001", "Diaz", "Pedro", "Av. San Martín 25", "La Rioja");
		Estudiante estudiante2 = new Estudiante("190002", "Lopez", "Pedro", "Av. Facundo Quiroga 25", "La Rioja");
		Estudiante estudiante3 = new Estudiante("190003", "Perez", "Pedro", "Av. Belgrano 25", "La Rioja");
		Estudiante estudiante4 = new Estudiante("190004", "Martinez", "Pedro", "Av. Castro Barros 25", "La Rioja");

		Calificacion calificacionEstudiante1 = new Calificacion(estudiante1, unExamen, 3);
		Calificacion calificacionEstudiante2 = new Calificacion(estudiante2, unExamen, 8);
		Calificacion calificacionEstudiante3 = new Calificacion(estudiante3, unExamen, 10);
		Calificacion calificacionEstudiante4 = new Calificacion(estudiante4, unExamen, 7);

		Collection<Calificacion> calificaciones = new LinkedList<Calificacion>();
		calificaciones.add(calificacionEstudiante1);
		calificaciones.add(calificacionEstudiante2);
		calificaciones.add(calificacionEstudiante3);
		calificaciones.add(calificacionEstudiante4);

		unExamen.setCalificaciones(calificaciones);

		LinkedList<Calificacion> resultado = unExamen.obtenerNotaMasAlta();

		assertEquals("Perez, Pedro -> 10 (SOBRESALIENTE)", resultado.get(0).obtenerNotaEstudiante());
	}

	@Test
	void obtenerPromedioGeneral_ExamenCompleto_RetornarPromedio() {
		Examen unExamen = new Examen(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III","Ingeniería en Sistemas");

		Estudiante estudiante1 = new Estudiante("190001", "Diaz", "Pedro", "Av. San Martín 25", "La Rioja");
		Estudiante estudiante2 = new Estudiante("190002", "Lopez", "Pedro", "Av. Facundo Quiroga 25", "La Rioja");
		Estudiante estudiante3 = new Estudiante("190003", "Perez", "Pedro", "Av. Belgrano 25", "La Rioja");
		Estudiante estudiante4 = new Estudiante("190004", "Martinez", "Pedro", "Av. Castro Barros 25", "La Rioja");

		Calificacion calificacionEstudiante1 = new Calificacion(estudiante1, unExamen, 3);
		Calificacion calificacionEstudiante2 = new Calificacion(estudiante2, unExamen, 8);
		Calificacion calificacionEstudiante3 = new Calificacion(estudiante3, unExamen, 10);
		Calificacion calificacionEstudiante4 = new Calificacion(estudiante4, unExamen, 7);

		Collection<Calificacion> calificaciones = new LinkedList<Calificacion>();
		calificaciones.add(calificacionEstudiante1);
		calificaciones.add(calificacionEstudiante2);
		calificaciones.add(calificacionEstudiante3);
		calificaciones.add(calificacionEstudiante4);

		unExamen.setCalificaciones(calificaciones);

		double resultado = unExamen.obtenerPromedio();

		assertEquals(7.0, resultado);
	}

	@Test
	void mostrarResumen_ExamenCompleto_MostrarFormateado() {
		Examen unExamen = new Examen(LocalDateTime.of(2018, 6, 13, 16, 0), "Programación III","Ingeniería en Sistemas");

		Estudiante estudiante1 = new Estudiante("190001", "Diaz", "Pedro", "Av. San Martín 25", "La Rioja");
		Estudiante estudiante2 = new Estudiante("190002", "Lopez", "Pedro", "Av. Facundo Quiroga 25", "La Rioja");
		Estudiante estudiante3 = new Estudiante("190003", "Perez", "Pedro", "Av. Belgrano 25", "La Rioja");
		Estudiante estudiante4 = new Estudiante("190004", "Martinez", "Pedro", "Av. Castro Barros 25", "La Rioja");

		Calificacion calificacionEstudiante1 = new Calificacion(estudiante1, unExamen, 3);
		Calificacion calificacionEstudiante2 = new Calificacion(estudiante2, unExamen, 8);
		Calificacion calificacionEstudiante3 = new Calificacion(estudiante3, unExamen, 10);
		Calificacion calificacionEstudiante4 = new Calificacion(estudiante4, unExamen, 7);

		Collection<Calificacion> calificaciones = new LinkedList<Calificacion>();
		calificaciones.add(calificacionEstudiante1);
		calificaciones.add(calificacionEstudiante2);
		calificaciones.add(calificacionEstudiante3);
		calificaciones.add(calificacionEstudiante4);

		unExamen.setCalificaciones(calificaciones);

		String resultado = unExamen.mostrarResumen();

		assertEquals("Examen de PROGRAMACIÓN III - INGENIERÍA EN SISTEMAS\nFecha: 13/06/2018 16:00\nAlumnos Inscriptos: 4\nCalificaciones:\n"+
		"Diaz, Pedro -> 3 (REPROBADO)\nLopez, Pedro -> 8 (APROBADO)\nPerez, Pedro -> 10 (SOBRESALIENTE)\nMartinez, Pedro -> 7 (APROBADO)", resultado);
	}
	

}
