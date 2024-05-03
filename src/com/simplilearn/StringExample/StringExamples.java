package com.simplilearn.StringExample;

public class StringExamples {

	public static void main(String[] args) {
		
		String s1 = new String("Hello World!");
		System.out.println(s1.length());
		
		String sub = new String("Welcome");
		System.out.println(sub.substring(2,4));

		String s2="Helllo";
		String s3 = "Helllo";
		
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.isEmpty());
		System.out.println(s2.toLowerCase());
		
		String s4 = "Heldo";
		String replace = s2.replace('d', 'l');
		System.out.println(replace);
		
		
		String x = "Welcome to Java";
		String y = "WelCOME TO Java";
		
		System.out.println(x.equalsIgnoreCase(y));
		
		StringBuilder sb = new StringBuilder("Welcome ");
		sb.append(" To ");
		sb.append(" Java ");
		
		System.out.println(sb.toString());
		
		
		
		
	}

}
