package javalearning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finding even numbers
		List<Integer> list = Arrays.asList(1,3,5,7,6,8);
		System.out.println(list.stream()
				.filter(n->n%2==0)
				.collect(Collectors.toList()));
		//Maximum Number in a Stream
		System.out.println(list.stream()
				.max(Integer::compare).get());
		//Minimum Number in a Stream
		System.out.println(list.stream()
				.min(Integer::compare).get());
		//Reversed order to get maximujm number
		System.out.println(list.stream()
				.min(Comparator.reverseOrder()).get());
		//AddingStrings with Reduce
		List<String> string = Arrays.asList("Anand","Babu","Babu","RamyaLakshmi");
		System.out.println(string.stream()
				.reduce((str1, str2)->str1+""+str2).get());
		//Adding number with the filtered numbers
		System.out.println(list.stream()
				.filter(n->n%2==0)
				.reduce((a,b)->a+b).get());
		//Map
		System.out.println(list.stream()
				.map(num->num*2)
				.collect(Collectors.toList()));
		//ForEach
		list.stream().forEach(System.out::println);
		//Distinct()
		List<Integer> list1 = Arrays.asList(1,3,3,5,6,7,6,8);
		System.out.println(list1.stream()
				.distinct()
				.collect(Collectors.toList()));
		//Unique Strings with Distinct //removing duplicate elements from the collection before processing them
		System.out.println(string.stream()
				.distinct()
				.collect(Collectors.toList()));
		//Skip() Example
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		.filter(i -> i % 2 == 0)
		.skip(2)
		.forEach(i -> System.out.print(i + " ()"));
		//Limit()
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		.filter(i -> i % 2 == 0)
		.skip(2)
		.forEach(i -> System.out.print(i + " "));
		//Peek()
		list.stream()
		.peek(System.out::println)
		.collect(Collectors.toList());











	}

}
