package javalearning;

import java.util.StringJoiner;

public class StringJoinerExample {
	 public static void main(String[] args) {
		 StringJoiner s = new StringJoiner(",");
		 s.add("Anand");
		 s.add("Ramya");
		 System.out.println(s);
		 
		 StringJoiner s1 = new StringJoiner(",", "[", "]");
		 
		 s1.add("Anand");
		 s1.add("Ramya");
		 System.out.println(s1);
	 }

}
