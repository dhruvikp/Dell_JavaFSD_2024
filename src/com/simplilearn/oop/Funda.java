package com.simplilearn.oop;

public class Funda {

	public static void main(String[] args) {
		
		System.out.println("Main gets executed");
		
		
		Pen pen  = new Pen();
		
		pen.write();
	}

}


class Pen {
	
	String refill = "red";
	
	public void write() {
		System.out.println("Writing using refil:"+refill);
	}
}