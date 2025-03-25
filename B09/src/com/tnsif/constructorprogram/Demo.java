package com.tnsif.constructorprogram;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorProgram ob = new ConstructorProgram(2,"manu","bang");
		System.out.println(ob);
		boolean output = ((ob) instanceof ConstructorProgram);
		System.out.println(output);
	}

}
