package com.tns.day6;

public class A {
	
class D extends A {	
	void ne(int a) {
		System.out.println("A");
	}
}
class E extends D{
	void ne(int a) {
		System.out.println("B");
	}
}
public static void main(String[]args) {
	A a=new A();
	D b=a.new D();
	E c=b.new E();
	c.ne(1);
}
}