package com.patito.actores;

import com.patito.util.Calificacion;

public class Profesor extends Persona1{
		
  // Agregacion (Profesor "has a" calificacion)
 public Calificacion calificacion;
 
 
 
 public Profesor(String nombre, int edad, double estatura, char genero) {
	super(nombre, edad, estatura, genero);
	// TODO Auto-generated constructor stub
	calificacion = new Calificacion();
	calificacion.par1=-1;
	calificacion.par2=-1;
	calificacion.par3=-1;
	calificacion.ordinario=-1;
}



public String calificar(String nombre) {
	 return "el profesor "+ nombre+" esta calificando...";
	}
}
