package com.tnsif.generics;
//syntax for generics class
//we can work with any data types
class Box<T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
public class GenericsClassExample {

	public static void main(String[] args) {
		//Working with integer
		Box<Integer> inbox = new Box<>();
		inbox.setValue(100);
		System.out.println("Integer Value: "+inbox.getValue());
		//Working with string
		Box<String> st = new Box<>();
		st.setValue("Hello World");
		System.out.println("String Value: "+st.getValue());
	}

}
