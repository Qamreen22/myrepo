package com.tnsif.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopDemo {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell",15,169999));
		laps.add(new Laptop("asus",22,17787));
		laps.add(new Laptop("Apple",2,17287));
		Collections.sort(laps);
		for(Laptop l: laps) {
			System.out.println(l);
		}
	}

}
