package com.tnsif.arrays_strings;
//input: [1,2,3,4,5]
//output: [5,4,3,2,1]
public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.print("Reversed array: ");
		for(int num: arr)
			System.out.print(num+" ");
	}

}
