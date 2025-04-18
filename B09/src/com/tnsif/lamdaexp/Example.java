package com.tnsif.lamdaexp;

public class Example {

	public static void main(String[] args) {
		//Greetings greet = () -> System.out.println("Hello");
		//greet.hello();
		
		Greetings greet = (a,b) -> {return(a+b);};
		System.out.println(greet.add(1, 2));

	}

}
