package com.tnsif.overloading;

public class MainOverloading {
	public static void main(String args[]) {
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
	public static void main(double a) {
		System.out.println("The number is: "+a);
		
	}
	public static void main(char ch) {
		System.out.println("The char is: "+ch);
	}
	
}
