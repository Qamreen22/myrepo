package com.tnsif.arrays_strings;

import java.util.Scanner;

public class SlicingAString {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String text = obj.nextLine();
		
		System.out.println("Enter the start index: ");
		int start = obj.nextInt();
		
		System.out.println("Enter the end index: ");
		int end = obj.nextInt();
		
		if(start>=0 && end<=text.length()){
			String slice = text.substring(start,end);
			System.out.println("Sliced String: "+slice);
		}
		else {
			System.out.println("Invalid String");
		}
	}

}
