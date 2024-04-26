package com.simplilearn.oop.inheritance;

public class InheritanceExample {

	public static void main(String[] args) {
		
		Bouncable ball = new Ball();
		ball.bounce();
		

	}

}

interface Shape {
	void draw();
	void test();
}

interface  Bouncable {
	void bounce();
	void test();
}


class Ball implements Shape, Bouncable {

	@Override
	public void bounce() {
		
	}

	@Override
	public void draw() {
		
	}

	@Override
	public void test() {
		
	}
	
}


