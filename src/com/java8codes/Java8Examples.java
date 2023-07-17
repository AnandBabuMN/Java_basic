package com.java8codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Examples {
	public static void main(String[] args) {

		//Java 8 code to find each character occurance in a String
		String input = "ilovejava";
		Map<String, Long> map = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);

		//Find all duplicate element in a given String
		List<String> list = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()>1)
		.map(Entry::getKey).collect(Collectors.toList());
		System.out.println(list);
		
		//Find Unique elements
		List<String> uniqueElements = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()==1)
				.map(Entry::getKey).collect(Collectors.toList());
				System.out.println(uniqueElements);
	}
}
