package com.tns.daythree;

public class AccessModifier {
	public int a;
	private int b;
	protected int c;
	int d;
	
	public void a() {
		System.out.println("public access modifier");
	}
	private void b() {
		System.out.println("private access modifier");
	}
	protected void c() {
		System.out.println("protected access modifier");
	} 
	void d() {
		System.out.println("default access modifier");
	}
	
	public static void main(String[]args) {
		AccessModifier s=new AccessModifier();
		s.a();
		s.b();
		s.c();
		s.d();
	}
	
	

}
