package com.simplilearn.CollectionsExample;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<String>();

		cities.add("Bangalore");
		cities.add("Hyderabad");
		cities.add("Ahmedabad");

		for (String city : cities) {
			System.out.println(city);
		}

		LinkedList<String> citiseLinkedList = new LinkedList<String>();

		citiseLinkedList.add("Bangalore");
		citiseLinkedList.add("Hyderabad");
		citiseLinkedList.add("Ahmedabad");

		for (String city : cities) {
			System.out.println(city);
		}

	}

}
