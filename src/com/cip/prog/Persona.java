package com.cip.prog;

public abstract class Persona {
	//Atributos
	private String Nombre;
	private int Anyo;
	
	//Constructor
	public Persona(String Nombre, int Anyo) {
		this.Nombre=Nombre;
		this.Anyo=Anyo;
	}

	//Setters and Getters
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getAnyo() {
		return Anyo;
	}

	public void setAnyo(int anyo) {
		Anyo = anyo;
	}
	
}


