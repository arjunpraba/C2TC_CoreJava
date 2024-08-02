package com.tns.day9;

import java.util.Scanner;

public class Service {
	
	public static void valid(int Age) throws InvalidAgeException {
		if(Age<18) {
			throw new InvalidAgeException("Age must be above 18 for voting");
		}
		else {
			System.out.println("you can vote");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {	
			System.out.println("Enter your Age: ");
			int Age = sc.nextInt();
			valid(Age);
			
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
