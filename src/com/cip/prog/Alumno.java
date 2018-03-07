package com.cip.prog;

public class Alumno extends Persona{
	//Atributo
	private String Curso;
	
	//Constructor
	public Alumno(String Curso, String Nombre, int Anyo) {
		super(Nombre, Anyo);
		this.Curso=Curso;
	}

	//Set & Get
	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}
	
	//toString
	public String toString() {
		return "ALUMNO: "+getNombre()+" - Curso: "+getCurso()+" - Año: "+getAnyo();
	}
	
	//método
	public int calcularDescuento(double Cantidad) {
		return (int) (Cantidad*0.10);
	}
}
