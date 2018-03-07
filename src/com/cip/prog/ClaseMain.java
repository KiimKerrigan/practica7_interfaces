package com.cip.prog;

public class ClaseMain {

	public static void main(String[] args) {
		
		//Creamos objetos: profesores y alumnos
		Profesor p1= new Profesor(500,"Jonay Sanchez", 1968);
		Profesor p2= new Profesor(650,"Alvaro Izquierdo", 1979);
		
		Alumno a1= new Alumno("Administrativo","Laura Baute", 1988);
		Alumno a2= new Alumno("Informática","Marta Perez", 1992);
	
		//Mostramos descuentos en base a dos precios para cada persona.
		double precio=100.0;
		System.out.println("\nPrecio del artículo 1: "+precio+"€");
		System.out.println(p1.toString()+"\nTiene un descuento de: "+p1.calcularDescuento(precio)+"%");
		System.out.println(a1.toString()+"\nTiene un descuento de: "+a1.calcularDescuento(precio)+"%");

		
		double precio2=175.25;
		System.out.println("\nPrecio del artículo 2: "+precio2+"€");
		System.out.println(p2.toString()+"\nTiene un descuento de: "+p2.calcularDescuento(precio2)+"%");
		System.out.println(a2.toString()+"\nTiene un descuento de: "+a2.calcularDescuento(precio2)+"%");

	}

}
