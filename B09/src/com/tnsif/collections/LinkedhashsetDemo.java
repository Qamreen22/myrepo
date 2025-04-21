package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedhashsetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		lset.add(10);
		lset.add(30);
		lset.add(5);
		lset.add(15);
		System.out.println("linkedHashset"+lset);
		//Collections.sort(lset); cannot sort linkedhashset directly
		//converting it into arraylist
		ArrayList<Integer> arr = new ArrayList<>(lset);
		Collections.sort(arr);
		System.out.println("Sorted "+arr);
		
		//using tree set
		TreeSet<Integer> tset = new TreeSet<>(lset);
		//by default treeset is in ascending order so no need to sort
		//natural sorting
		System.out.println("Sorted "+tset);

		
	}

}
