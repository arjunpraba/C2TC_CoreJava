package com.tns.day4;

public class StaticDemo {
	static int a=10;
	static {
		System.out.println("static_block"+a);
	}
	static void display() {
		System.out.println("static_mathod");
	}

}

