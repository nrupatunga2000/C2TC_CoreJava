package com.cg.enums;

public class SwitchEnum {
	enum Choice{
		Choice1, Choice2, Choice3;
	}

	public static void main(String[] args) {
		Choice ch;
		switch(ch) {
		case Choice1:
			System.out.println("choice is chosen");
			break;
		case Choice2:
			System.out.println("choice is chosen");
			break;
		case Choice3:
			System.out.println("choice is chosen");
			break;
		}
		
	}

}
