package com.tns.day5;

public class FinalClassdemo {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
class FinalChildClass extends FinalClassDemo {
}

public class FinalClassDemo {
	public static void main(String[] args) {
		// Create the object of final class
		FinalClassdemo f1 = new FinalClassdemo(); // Call show() method using object reference variable ab.
		f1.show();
	}
}
}
