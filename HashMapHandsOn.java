package collectionsHandsOn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapHandsOn {
	// Adding 2nd rows will overwrite the 1st row in Map
	// Set or Arraylist need to be added as Generic Arugument to add more than one row in Map
	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("Ser.No", "1");
		map.put("Customer Name", "Customer 1");
		map.put("Amount", "100");
		
		// This won't work
//		map.put("Ser.No", "2");
//		map.put("Customer Name", "Customer 2");
//		map.put("Amount", "100");
		
		
		// This will print {Amount=100, Ser.No=1, Customer Name=Customer 1}
		System.out.println(map);
		
		// Key and Value will be considered as size of 1 in HashMap
		System.out.println("Size of the Map is " +map.size());
		
		Set<String> keyValues = map.keySet();
		
		for (String key : keyValues) {
			
			System.out.println(key + "---" + map.get(key));
		}
		
		Map<String, ArrayList<String>> map2 = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Customer 1");
		list.add("Customer 2");
		list.add("Customer 3");
		list.add("Customer 4");
		list.add("Customer 1");
		list.add("Customer 5");
		
		map2.put("Customer Name", list);
		
		// Print HashMap 
		// {Customer Name=[Customer 1, Customer 2, Customer 3, Customer 4, Customer 1, Customer 5]}
		System.out.println(map2);
				
		// Print Arraylist one by one
		for (String string : list) {
			
			System.out.println(string);
			
		}

	}

}
