package com.cg.fundamentals;

public class PreandPostDecrement {

	public static void main(String[] args) {
		int numA=5;
		int numB=10;
		int numC=0;
		
		numC = --numC + numB--; //numC-1 =numC -->-1// numB =numB-1//-1+10 -->9
		System.out.println(numA);
		System.out.println(numB);//9
		System.out.println(numC);//10-1=9

	}

}
