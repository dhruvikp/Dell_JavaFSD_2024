package com.simplilearn.oop.inheritance;



class Employee {
	float salary = 40000;
}



public class Programmer extends Employee {
	int bonus = 10000;
	float salary = 45000;
	
	
	public static void main(String[] args) {
		Programmer p = new Programmer();
		
		System.out.println(p.salary + p.bonus);
		
		BabyDog bd = new BabyDog();
		bd.bark();
		bd.eat();
		bd.weep();
				
	}

}

class Animal {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("Weeping..");
	}
}