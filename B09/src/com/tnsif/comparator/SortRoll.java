package com.tnsif.comparator;

import java.util.Comparator;

public class SortRoll implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		//cuz its int
		return a.rolNo-b.rolNo;
	}
	

}
