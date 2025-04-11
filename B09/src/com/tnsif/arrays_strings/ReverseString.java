package com.tnsif.arrays_strings;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String text = obj.nextLine();
		String rev = "";
		for(int i = text.length()-1;i>=0;i--) {
			rev+=text.charAt(i);
		}
		System.out.println("Reversed String: "+rev);
	}

}
