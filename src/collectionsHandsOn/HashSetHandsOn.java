package collectionsHandsOn;

import java.util.HashSet;
import java.util.Set;

public class HashSetHandsOn {
	// HashSet do not accept duplicate value
	// HashSet do not store the values in order
	
	// HashSet individual values can be print by Foreach or Iterator loop
	// We cannot use For lop for Set collection
	// Set allow null value
	public static void main(String[] args) {

		Set<String> stringSet = new HashSet<String>();
		
		stringSet.add("Customer 1");
		stringSet.add("Customer 2");
		stringSet.add("Customer 3");
		stringSet.add("Customer 4");
		stringSet.add("Customer 5");
		stringSet.add("Customer 4");
		
		// null do add the size of Set by +1
		stringSet.add(null);

		//size() is 5, Set do not accept duplicate value
		System.out.println("Size of the String --> " +stringSet.size());
		
		// Print the complete value in Set
		System.out.println(stringSet);
		
		// Print the values one by one
		for (String s : stringSet) {
			
			System.out.println(s);
			
			// Verify particualr entry in Set
			if (s == "Customer 1") {
				
				System.out.println("True");
			}
		}
		
	}

}
