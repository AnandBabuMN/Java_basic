package javalearning;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {
		Java8Static.show();
		// TODO Auto-generated method stub
		Map<Integer, String> hM = new HashMap<>();
		hM.put(1, "Anand");
		hM.put(2, "Ramya");
		hM.put(3, "Indhu");
//		for(Map.Entry<Integer, String> entry : hM.entrySet()) {
//			System.out.println(entry.getKey()+" " + entry.getValue());
//		}
		hM.forEach((k,v)->System.out.println(k+" "+v)); 
	}
}
