package com.simplilearn.oop.abstraction;

public class AbstractExample {

	public static void main(String[] args) {
		Shape shape = new Rectangle();
		shape.draw();

	}

}

abstract class Shape {
	 abstract void draw();
	 
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Rectangle is drawn");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Circle is drawn..");
	}
}

