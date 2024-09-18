 package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// Creating HashMap and
	    // adding elements
				
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

				hm.put(401, "Ramu");
				hm.put(412, "Megha");
				hm.put(486, "Ezhil");
				hm.put(445, "Rahul");

				// Finding the value for a key
				System.out.println("Value for 401 is " + hm.get(401)+"\n");

				// Traversing through the HashMap
				for (Map.Entry<Integer, String> e : hm.entrySet())
					System.out.println(e.getKey() + " " + e.getValue());

				HashMap<String, String> hm1 = new HashMap<String, String>();

				hm1.put("Aaa", "Ramu");
				hm1.put("Bbb", "Ramu");
				hm1.put("Ccc", "Raju");
				hm1.put("Ddd", "Rahul");

				// Traversing through the HashMap
				for (Map.Entry<String, String> e1 : hm1.entrySet())
					System.out.println(e1.getKey() + " " + e1.getValue());

	}

}
