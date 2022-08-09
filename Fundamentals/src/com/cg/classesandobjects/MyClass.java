package com.cg.classesandobjects;

public class MyClass {
	static Myclass obj = new Myclass();
	static int countobj;
	private MyClass() {
		super();
		System.out.println("super class is created");
		
		
	}
	public static void count() {
		countobj = countobj+1;
		System.out.println("total number of objects" +countobj);
	
	}
	public static MyClass get Instance() {
		return obj;
	}

}
