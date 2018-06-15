package model;

public class Calificacion {

	private Estudiante estudiante;
	private Examen test;
	private String resultado;
	private Integer nota;

	public Calificacion(Estudiante estudiante, Examen test, Integer nota) {
		this.estudiante = estudiante;
		this.test = test;
		this.nota = nota;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Examen getTest() {
		return test;
	}

	public void setTest(Examen test) {
		this.test = test;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	

}
