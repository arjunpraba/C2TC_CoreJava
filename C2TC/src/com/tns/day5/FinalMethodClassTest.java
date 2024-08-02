package com.tns.day5;

public class FinalMethodClassTest extends FinalMethodClass {
	// Compile time error because we cannot override the final method 
		
	public static void main(String[]args) {
		FinalMethodClass m=new FinalMethodClass();
		m.show();
	}
}
