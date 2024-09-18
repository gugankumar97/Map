package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		  
        // Adding elements to the tree map
        treeMap.put("A", 1);
        treeMap.put("C", 2);
        treeMap.put("B", 3);
 
        // Getting values from the tree map
        int valueA = treeMap.get("A");
        System.out.println("Value of A: " + valueA);
 
        // Removing elements from the tree map
       // treeMap.remove("B");
 
        // Iterating over the elements of the tree map
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

	}

}
