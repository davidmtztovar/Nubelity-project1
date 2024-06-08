package com.patito.exceptions;

public class Average {
 public static void main(String[] args) throws IntegerDivisionByZero {
  try {	
	 printAverage(100, 0);
     }catch (IntegerDivisionByZero i) {
	   System.out.println("Exeption in main: "+i.getMessage());
     }
}//main
  public static void printAverage(int totalSum, int totalNumber) throws IntegerDivisionByZero {
//	 try {
//	  int average=computeAverage(totalSum, totalNumber);
//	 System.out.println("Average= "+totalSum+" / "+ totalNumber
//			 +" = "+average);
//	 System.out.println("Exit printAverage().");
//	  } catch (IllegalArgumentException e) {
//			System.out.println("Can't divide "+e.getMessage());	
//	  }
//	 finally {
//		System.out.println("Always");
//	}
	  int average=computeAverage(totalSum, totalNumber);
		 System.out.println("Average= "+totalSum+" / "+ totalNumber
				 +" = "+average);
		 System.out.println("Exit printAverage().");
  }//
private static int computeAverage(int sum, int number) throws IntegerDivisionByZero {
	System.out.println("Computing average...");
	if(number==0)
		throw new IntegerDivisionByZero("Integer divided by 0"); //se crea objeto exepcion, se le atribuye el mensaje, thwow inicia su propagacion
	return sum/number;
 }//


}//class

class IntegerDivisionByZero extends Exception{
	public IntegerDivisionByZero(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
  }
