package com.patito.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
        HashSet<String> set1= new HashSet<>();
        set1.add("breakfast");
        set1.add("lunch");
        set1.add("dinner");
        for(String s:set1) {
        	System.out.println(s);
        }
        
        Set<String> set2= new LinkedHashSet<>();
        set2.add("breakfast");
        set2.add("lunch");
        set2.add("dinner");
        System.out.println("Serving meals from a LinkedHashSet");
        for (String string : set2) {
			System.out.println(string);
		}
	}
}
