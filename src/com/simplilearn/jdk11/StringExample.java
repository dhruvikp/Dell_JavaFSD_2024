package com.simplilearn.jdk11;

public class StringExample {

	public static void main(String[] args) {
		String str = "    Hello Simplilearn!    ";
		
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);
		
		System.out.println(str.strip());
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());
	}
}
