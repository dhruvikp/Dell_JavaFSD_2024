package com.simplilearn.constructor;

public class ConstructorExample {

	public static void main(String[] args) {
		
		Parker p = new Parker();
		
		p.write();
		

	
	}

}

class Pen {

	Pen(String refill) {
		System.out.println("Pen is initialized");
	}
	
	Pen() {
	super();	
	}
}

class Parker extends Pen {
	String refill;
	
	Parker() {
		System.out.println("Parker is initialized");
	}
	
	public void write() {
		
	}
}


