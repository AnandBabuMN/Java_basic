package javalearning;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class FlatMapExample {
	 static public void main(String[] args) {

		List<Integer> l1=Arrays.asList(1,3,5,6,7,8);
		List<Integer> l2=Arrays.asList(5,6,7);
		List<Integer> l3=Arrays.asList(8,9,10);
		List<List<Integer>> ll = Arrays.asList(l1,l2,l3);
		System.out.println(ll);
		List<Integer> op = ll.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
		System.out.println(op);
//		Optional<Integer> X = l1.stream().filter(i->i%2==0).findAny();
//		System.out.println(X);
		
		
//		Thread t = new Thread();
//		try {
//			t.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


	}

}
