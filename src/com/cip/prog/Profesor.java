package com.cip.prog;

public class Profesor extends Persona {
	//Atributo
	private int Salario;
	
	//Constructor
	public Profesor(int Salario, String Nombre, int Anyo) {
		super(Nombre, Anyo);
		this.Salario=Salario;
	}

	//Set & Get
	public int getSalario() {
		return Salario;
	}

	public void setSalario(int salario) {
		Salario = salario;
	}
	
	//toString
	public String toString() {
		return "PROFESOR: "+getNombre()+" - Salario: "+getSalario()+"� - A�o: "+getAnyo();
	}
	
	//m�todo
	public int calcularDescuento(double Cantidad) {
		return (int) (Cantidad*0.02);
	}
}
