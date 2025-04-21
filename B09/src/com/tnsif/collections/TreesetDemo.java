package com.tnsif.collections;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("HTML");
		t.add("java");
		t.add("HTML");
		//t.add(null); null not allowed
		System.out.println("course are: "+t);
		
	}

}
