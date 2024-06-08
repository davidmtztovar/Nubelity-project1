package com.patito.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetExample3 {
	final static int NUM_DIGITS=5;
	final static int p=5;
	public static void main(String[] args) {
		try {
			if(args.length!=1|| args[0].length()!=NUM_DIGITS)
			throw new IllegalArgumentException();
			Integer.parseInt(args[0]);
		}catch(IllegalArgumentException e) {
			System.err.println("Guess shold be"+NUM_DIGITS+" digits");
		}
        
        String guessStr= args[0];
        System.out.println("Guess: "+guessStr);
        
        List<Integer> secretSolution= new ArrayList<>();
        secretSolution.add(5);
        secretSolution.add(3);
        secretSolution.add(2);
        secretSolution.add(7);
        secretSolution.add(2);
        
        List<Integer> guess= new ArrayList<>();
        for(int i=0; i<guessStr.length();i++) {
        	guess.add(Character.getNumericValue(guessStr.charAt(i)));
        }
	}
}
