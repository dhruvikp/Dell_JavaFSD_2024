package com.simplilearn.oop.encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {
		
		Pen pen = new Pen();
		pen.setRefill("Red");
		
		System.out.println(pen.getRefill());

		pen.setRefill("Blue");
		System.out.println(pen.getRefill());

	}
}

class Pen {
	private String refill ;
	
	public void setRefill(String refill) {
		this.refill = refill;
	}
	
	public String getRefill() {
		return this.refill;
	}
}
