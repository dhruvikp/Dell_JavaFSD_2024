package com.simplilearn.CollectionsExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> city = new HashSet<String>();
		city.add("Bangalore");
		city.add("Hyderabad");
		city.add("Bombay");
		city.add("Bombay");
		city.add("Ahmedabad");
		
		Iterator<String> cityItr =  city.iterator();

		while(cityItr.hasNext()) {
			System.out.println(cityItr.next());
		}
		
	}

}
