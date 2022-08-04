package com.cg.fundamentals;
import java.util.Random;

public class RelationalAndLogicalOperators {

	public static void main(String[] args) {
		Random random = new Random();// className objName = new className();
		int i = random.nextInt(100);
		int j = random.nextInt(100);
		System.out.println("i=" +i);
		System.out.println("j=" +j);
		System.out.println("i>j" +(i>j));
		System.out.println("i<j" +(i<j));
		System.out.println("i!=j" +(i!=j));
		
		//Logical operators 
		int i1 =50;
		int j1 = 4;
		System.out.println((i1<10)&&(j1<10));
		System.out.println((i1<10)||(j1<10));





	}

}
