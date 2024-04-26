package com.simplilearn.oop.accessspecifier.b;

import com.simplilearn.oop.accessspecifier.a.A;

public class B extends A{

	public static void main(String[] args) {
		B b = new B();
		b.message();
		
		A a = new A();
		a.message();
	}

}
