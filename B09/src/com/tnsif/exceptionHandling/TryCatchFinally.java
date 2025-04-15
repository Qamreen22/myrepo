package com.tnsif.exceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			//code that may throw an exception
			int result = 10/0;
		}
		catch(Exception e){
			//Handle the exception
			System.out.println("Caught an exception!!!" + e);
		}
		finally {
			//This block always executes
			System.out.println("This is Finally Block");
		}

	}

}
