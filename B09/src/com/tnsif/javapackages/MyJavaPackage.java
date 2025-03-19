package com.tnsif.javapackages;

public class MyJavaPackage {
	private int id;
	String name;
	protected int marks;
	public String collageName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	@Override
	public String toString() {
		return "MyJavaPackage [id=" + id + ", name=" + name + ", marks=" + marks + ", collageName=" + collageName + "]";
	}
}
