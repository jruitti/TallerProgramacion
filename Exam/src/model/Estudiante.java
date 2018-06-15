package model;

public class Estudiante {

	public String matricula;
	public String apellido;
	public String nombre;
	public String domicilio;
	public String provincia;

	public Estudiante(String matricula, String apellido, String nombre, String domicilio, String provincia) {
		this.matricula = matricula;
		this.apellido = apellido;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.provincia = provincia;
	}

	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

}
