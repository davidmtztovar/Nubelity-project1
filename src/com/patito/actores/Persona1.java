package com.patito.actores;

public class Persona1 {
  public String nombre;
  int edad;
  double estatura;
  char genero;
  
  
	public Persona1(String nombre, int edad, double estatura, char genero) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.estatura = estatura;
	this.genero = genero;
}

	public Persona1(String nombre) {
		
	}

	public String respirar(String nombre) {
		 return nombre+" respirando...";
		}
	
	public String leer(String nombre) {
		 return nombre+" leyendo...";
		}
}
