package com.simplilearn.memorymgmt;

public class MemoryManagement {

	public static void main(String[] args) {
		A a = new A();
		a.a();

	}

}

class A {
	void a() {
		B b = new B();
		b.b();
		System.out.println("A is executed");
	}
}

class B {
	void b() {
		C c = new C();
		c.c();
		System.out.println("B is executed");
	}
}

class C {
	void c() {
		System.out.println("C is invoked");
	}
}