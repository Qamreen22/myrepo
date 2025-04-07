package com.tnsif.collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		//generic list 
		ArrayList list = new ArrayList();
		System.out.println("The size of the arrayList: "+list.isEmpty());
		System.out.println("The size of the arrayList: "+list.size());
		list.add(2);
		list.add('A');
		//list.add("Hello");
		list.add(34.87);
		System.out.println("The size of the arrayList: "+list.size());
		System.out.println(list);
		System.out.println(list.contains("Hello"));
		System.out.println(list.contains(33));
		list.remove(0);
		System.out.println(list);
		System.out.println(list.get(0));
		
		//int list
		ArrayList <Integer> list2 = new ArrayList();
		list2.add(10000);
		list2.add(200);
		list.add(null);
		list2.add(300);
		list2.add(300);
		list.add(null);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
	}
}
