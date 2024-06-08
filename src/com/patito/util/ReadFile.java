package com.patito.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
public  void read(String path) {
	//try catch con parametros, cierra automaticamente los recursos
	//no sera necesario usar fr.close
	
	try(FileReader fr= new FileReader(path)) {
		BufferedReader br= new BufferedReader(fr);
		System.out.println();
	} catch (IOException e) {
		//IOException engloba a FileNotFoundException, ambas exepciones quedan cubiertas
		// TODO Auto-generated catch block
		System.out.println("Error reading file: "+e.getMessage());
	}
	
	
   }//read

  public static void main(String[] args) {
	ReadFile r= new ReadFile();
	  r.read("aa");
  }//main
}
