package com.tnsif.arrays_strings;

//Find the largest element in the array
//input: [10,20,5,30,15]
//output: 30

public class MaxArrayExample {

	public static void main(String[] args) {
		int[] arr = {10,20,5,30,15};
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("Max element: "+max);

	}

}
