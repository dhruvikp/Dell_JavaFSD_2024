package com.simplilearn.oop.inheritance;

public class Polymorphism {

	public static void main(String[] args) {
		
		Bike v = new Bike();
		v.drive();
		
		
		
		Vehicle v2 = new Bike();
		v2.drive();
	
	
		Vehicle v3 = new Car();
		v3.drive();
	}
}

abstract class Vehicle {
	abstract void drive();
	
	void horn() {
		System.out.println("Horning..");
	}
}

class Bike extends Vehicle {
	void drive() {
		System.out.println("Bike is running..");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Car is running..");
	}
}



