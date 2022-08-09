package com.cg.enums;

enum Months{ // used to create range of constants
	Jan(31), Feb(28), Mar(31), Apr(30),May(31),Jun(30),July(31),Aug(31),Sep(30),Oct(31),Nov(30),Dec(31);
	//attribute to hold the no of days
	private int days;
	//constructor will accept the no of days in the months
	 Months(int days){
		 this.days = days;
		 
	 }
	 //return the number of days
	 public int getDays() {
		 return days;
	 }
	
	
}





public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Days in the month of november are " + Months.Nov.getDays());

	}

}
