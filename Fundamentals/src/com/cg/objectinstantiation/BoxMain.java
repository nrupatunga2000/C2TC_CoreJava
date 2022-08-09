package com.cg.objectinstantiation;

public class BoxMain {
	double length;
	double breadth;
	double height;
	
	//non parameterised constructor
	public BoxMain() {
		super();
		
	}

	public BoxMain(double length, double breadth, double height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	double calculateVolume() {
		return length*breadth*height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
public class BoxMain{
	public static void main(String[]args) {
		BoxMain box1 = new BoxMain();
		System.out.println(box1.calculateVolume());
	}
}
