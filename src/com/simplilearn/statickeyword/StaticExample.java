package com.simplilearn.statickeyword;

public class StaticExample {

	public static void main(String[] args) {
		

		A.a();
		System.out.println(A.age);
		
	}

}

class A {
	
	static int age;
	
	static void a() {
		System.out.println("a method is called.");
	}
}
