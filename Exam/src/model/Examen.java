package model;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.LinkedList;

public class Examen {

	private LocalDateTime fecha;

	// Esto representa una asignatura
	private String asignatura;

	// Esto representa una carrera
	private String carrera;

	// Esto representa las notas del examen
	private Collection<Calificacion> calificaciones;

	public Examen(LocalDateTime fecha, String asignatura, String carrera) {
		this.fecha = fecha;
		this.asignatura = asignatura;
		this.carrera = carrera;

	}

	public Collection<Calificacion> obtenerCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(Collection<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}



}
