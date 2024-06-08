package com.patito.collections;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;
import static java.lang.System.out;

public class SetExample2 {
	public static void main(String[] args) {
	//orden natural para Strings
       NavigableSet<String> strSetA= new TreeSet<>();
       Collections.addAll(strSetA, "Strictly","Java","dancing","ballroom");
       //metodo out es esttatico
       out.println("Before: "+strSetA);
       System.out.println("Subsets");
       out.println(strSetA.headSet("ballroom",true));
       out.println(strSetA.headSet("ballroom",false));
       out.println(strSetA.headSet("Strictly",true));
       out.println(strSetA.headSet("Strictly",false));
       
       out.println("Closer matches: ");
       out.println(strSetA.ceiling("ball"));
       out.println(strSetA.floor("ball"));
       
       out.println(strSetA.descendingSet());
       
       
	}//main
}
