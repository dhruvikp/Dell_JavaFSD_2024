package com.simplilearn.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionExamples {

	public static void main(String[] args) {

		int[] arr = new int[3];

		try {
			System.out.println(arr[7]);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Called finally blocked..");
		}

		System.out.println("Done..!");

		CalculatorDemo calc = new CalculatorDemo();

		try {
			calc.division(5, 10);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Deon1!");
		
		AgeValidator ageValidator = new AgeValidator();
		try {
			ageValidator.validateAge(15);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

}

// throw keyword
class CalculatorDemo {

	int division(int a, int b) throws FileNotFoundException {
		if (b == 0) {
			FileOutputStream fis = new FileOutputStream(new File("test"));

		}

		int result = a / b;
		return result;
	}
}

class AgeValidator {
	boolean validateAge(int age) throws InvalidAgeException {
		if (age > 18)
			return true;
		
		throw new InvalidAgeException();
	}
}

class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;
}
