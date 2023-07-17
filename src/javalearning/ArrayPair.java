package javalearning;

import java.util.HashMap;
import java.util.Map;

public class ArrayPair {

	
		    public static void main(String[] args) {
		        int[] arr = { 10, 10, 20, 20, 30, 20, 10, 30};

		        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		        for (int i = 0; i < arr.length; i++) {
		            Integer count = map.get(arr[i]);
		            if (count == null)
		                map.put(arr[i], 1);
		            else
		                map.put(arr[i], count + 1);
		        }

		        int uniqueCount = 0;

		        for (Integer i : map.values())
		            if(i >= 2){
		                uniqueCount++;
		            }
		        System.out.println(uniqueCount);
		    }
		    }


















