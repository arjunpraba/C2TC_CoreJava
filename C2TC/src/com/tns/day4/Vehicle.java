package com.tns.day4;

class Vehicle {
	String colour;
	String engine;
	String model;
	int price;
	int speed; 
	
class bike extends Vehicle {
	String BrakeType;
	void displayBike() {
		String colour="black",engine="triple",model="125",BikeType="pulser",BreakType="BrakeType";
		int price=100000,speed=125;
		System.out.println("BikeType: "+BikeType);
		System.out.println("BikeModel: "+model);
		System.out.println("BikeEngine: "+engine);
		System.out.println("BikeColour: "+colour);
		System.out.println("BikePrice: "+price);
		System.out.println("BikeSpeed: "+speed);
		System.out.println("BreakType"+BreakType);
	}
	
}
class car extends Vehicle {
	String OperatingType;
	int seats;
	void displayCar() {
		String colour="Red",OperatingType="Automatic",engine="QUAD",model="400",CarType="Lamborgini";
		int price=10000000,speed=125,seats=4;
		System.out.println("CarType: "+CarType);
		System.out.println("CarModel: "+model);
		System.out.println("CarColour: "+colour);
		System.out.println("CarPrice: "+price);
		System.out.println("CarSpeed: "+speed);
		System.out.println("CarOperatingType: "+OperatingType);
		System.out.println("CarEngine: "+engine);
		System.out.println("CarSeats: "+seats);
		
	}
}


	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		bike b=v.new bike();
		car c=v.new car();
		c.displayCar();
		b.displayBike();
		}
}
