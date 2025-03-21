package com.tnsif.javapackages;
import java.util.Scanner;

public class DataTypes_21stMarch2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your id");
		int num = input.nextInt();
		System.out.println("your id is: "+num);
		input.nextLine();//to go to next line
		//string
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Hello "+name);
		//char
		System.out.println("Enter a char:");
		char ch = input.next().charAt(0);
		System.out.println("Character entered is: "+ch);
		//float or double
		System.out.println("Enter a float value:");
		double val = input.nextDouble();
		System.out.println("Double value: "+val);
	}

}
