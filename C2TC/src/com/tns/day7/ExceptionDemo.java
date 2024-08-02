package com.tns.day7;

public class ExceptionDemo {
	
	
	public static void main(String[] args) {
		try {
			int a=1/1;
			}
			catch(Exception a) {
				System.out.println(a.getMessage());
			}
		finally {
			System.out.println("finally");
		}

		// TODO Auto-generated method stub

	}

}
