package com.patito.actores;

import com.patito.util.Calificacion;

public class Estudiante extends Persona1{

	//public String nombre;
	public Calificacion calificacion;
    	
	public Estudiante(String nombre, int edad, double estatura, char genero) {
		super(nombre, edad, estatura, genero);
		// TODO Auto-generated constructor stub
		calificacion = new Calificacion();
		calificacion.par1=-1;
		calificacion.par2=-1;
		calificacion.par3=-1;
		calificacion.ordinario=-1;
	}
  
	
	public String leer(String nombre) {
		 return "el estudiante "+ nombre+" esta leyendo...";
		}
	public String Estudiar(String nombre) {
		 return "el estudiante "+ nombre+" esta estudiando...";
		}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", calificacion=" + calificacion +"]";
	}
	
	
	
}
