package com.patito.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample4 {
	public static void main(String[] args) {
     Map<Integer, Integer> groupFreqMap =new HashMap<>();
      
	for (String string : args) {
		double weight= Double.parseDouble(string);
		int weightGroup= (int) Math.round(weight/5)*5;
		Integer frequency= groupFreqMap.get(weightGroup);
		
		frequency=(frequency==null)? 1:frequency+1;
		groupFreqMap.put(weightGroup, frequency);
	  }
		SortedSet<Integer> groupSet= new TreeSet<>(groupFreqMap.keySet());
	for (int group : groupSet) {
		int frequency= groupFreqMap.get(group);
		System.out.println(group+" : "+frequency);
		
		char[]bar= new char[frequency];//Length=frequency
		Arrays.fill(bar, '*');
		//express the number of frequency with *
		System.out.println(group+" : "+new String(bar));
	}
	  
	}//main
}
