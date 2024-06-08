package com.patito.main;
import com.patito.actores.Estudiante;
import com.patito.actores.Persona1;
import com.patito.actores.Profesor;
import com.patito.util.*;

public class Escuela {
 public static void main(String[] args) {
	System.out.println("Hola mundo");
	
	Calificacion calificacion = new Calificacion();
	calificacion.par1=8;
	calificacion.par2=9;
	calificacion.par3=10;
	calificacion.ordinario=10;
	Estudiante e= new Estudiante("Juan", 19, 177.5, 'm');
	
	Estudiante e2= new Estudiante("Pedro", 19, 172.5, 'm');
	Persona1 p= new Estudiante("Frida", 19, 172.5, 'f');
	
	System.out.println("Nombre "+ e.nombre+ " "+
			e.calificacion.toString());
	
	System.out.println("Nombre "+ e2.nombre+ " "+e2.respirar(e2.nombre));
	System.out.println(e.leer(e.nombre));
	
	
	Estudiante a=(Estudiante) p;
	System.out.println(a.Estudiar(a.nombre));
 }//main
 
}//class
