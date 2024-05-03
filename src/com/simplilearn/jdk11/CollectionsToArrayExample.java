package com.simplilearn.jdk11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CollectionsToArrayExample {

	public static void main(String[] args) {
		
		
		Consumer<Integer> consumer = (var s) -> System.out.println(s);
		consumer.accept(5);
		
		
		
		
		List<String> list = Arrays.asList("John", "Julie");
		
		// Old way
		String[] names = list.toArray(new String[list.size()]);
		System.out.println(names.length);
		
		
		// New way
		names = list.toArray(String[]::new);
		System.out.println(names.length);

	}

}
