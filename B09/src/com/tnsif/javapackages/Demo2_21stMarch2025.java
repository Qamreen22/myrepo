package com.tnsif.javapackages;
import java.util.Scanner;

public class Demo2_21stMarch2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		boolean a = obj.hasNextInt();
		int s = 0;
		if(a == true) {
			s = obj.nextInt();
			System.out.println("You entered: "+s);
		}
		else {
			System.out.println("Invalid Data Type");
		}
	}

}
