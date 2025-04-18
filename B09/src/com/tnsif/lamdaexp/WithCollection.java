package com.tnsif.lamdaexp;

import java.util.Arrays;
import java.util.List;

public class WithCollection {

	public static void main(String[] args) {
		//to create a fixed sized list
		List<String> ob = Arrays.asList("ram","kumar","Satya");
		ob.forEach(name->System.out.println(name));

	}

}
