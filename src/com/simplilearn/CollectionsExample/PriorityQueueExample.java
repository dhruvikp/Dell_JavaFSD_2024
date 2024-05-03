package com.simplilearn.CollectionsExample;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("Dhruvik");
		queue.add("Amit");
		queue.add("Jai");
		queue.add("Binay");

		System.out.println(queue.remove()); 
		
	}

}
