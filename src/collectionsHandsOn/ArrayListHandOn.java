package collectionsHandsOn;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListHandOn {
	// Array list can accept dupilcate values
	// Array list saves the values in order and values can be retrieved with index
	// Array list allows null value
	public static void main(String[] args) {
		
		// Array list without generic
		ArrayList list = new ArrayList(); 
		
		// Array list with generic argument as String, stringList obj will accept only the string value
		// Generic argument can be of any Class of valid permitive data type
		ArrayList<String> stringList = new ArrayList<String>();
		
		list.add(1);
		list.add("Sathish");
		stringList.add("Customer 1");
		// Value in Array list can be removed by using remove function
		stringList.remove(0);
		
		// Print the whole ArrayList [1, Sathish]
		System.out.println(list);
		
		//Print the ArrayList one by one, For loop
//		for (int i=0; i<list.size(); i++) {
//			
//			System.out.println(list.get(i));
//			
//		}
		
		//Print the ArrayList one by one, foreach
//		for (Object object : list) {
//			
//			System.out.println(object);
//			
//		}
		
		//Print the ArrayList one by one, Iterator
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
	}

}
