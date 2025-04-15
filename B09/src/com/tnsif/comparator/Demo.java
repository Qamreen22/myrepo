package com.tnsif.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(12,"abc","bang"));
		ar.add(new Student(13,"bcd","del"));
		ar.add(new Student(6,"tye","mysore"));
		System.out.println("------------");
		Collections.sort(ar,new SortRoll());
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		Collections.sort(ar,new SortName());
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}

}
