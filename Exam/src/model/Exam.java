package model;

import java.time.LocalDateTime;
import java.util.Collection;

public class Exam {

	private LocalDateTime date;

	// Esto representa una asignatura
	private String course;

	// Esto representa una carrera
	private String degree;

	// Esto representa las notas del examen
	private Collection<Calification> scores;

	public Exam(LocalDateTime date, String course, String degree) {
		this.date = date;
		this.course = course;
		this.degree = degree;
	}

	public Collection<Calification> getScores() {
		return scores;
	}

	public void setScores(Collection<Calification> scores) {
		this.scores = scores;
	}

}
