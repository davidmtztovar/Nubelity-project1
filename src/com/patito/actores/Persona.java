package com.patito.actores;

public interface Persona {

	public String nombre="";
	
	default String respirar(String nombre) {
	 return nombre+" respirando...";
	}
	
	
}
