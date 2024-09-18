package Collections;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		// Creating an empty LinkedHashMap
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		// Inserting pair entries in above Map
		// using put() method
		map.put("vishal", 10);
		//map.put("sachin");
		map.put("vaibhav", 20);
		map.put("rakesh", 10);
		
		//map.putIfAbsent("sachin", 50);
		// Iterating over Map
		for (Map.Entry<String, Integer> e : map.entrySet())

			// Printing key-value pairs
			System.out.println(e.getKey() + " " + e.getValue());

		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		
		lhm.put("Aaa", "Ramu");
		lhm.put("Bbb", "Nanda");
		lhm.put("Ccc", "Raju");
		lhm.put("Ddd", "Rahul");
		
		lhm.putIfAbsent("Bbb", "Raj");

		// Iterating over Map
		for (Map.Entry<String, String> e : lhm.entrySet())

			// Printing key-value pairs
			System.out.println(e.getKey() + " " + e.getValue());

	}

}
