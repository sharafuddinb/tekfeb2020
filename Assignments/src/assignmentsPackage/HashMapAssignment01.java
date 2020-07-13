package assignmentsPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapAssignment01 {

	public static void main(String[] args) {
		Map<Integer, ArrayList<String>> ab = new HashMap<Integer, ArrayList<String>>();

		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		ArrayList<String> a3 = new ArrayList<String>();
		ArrayList<String> a4 = new ArrayList<String>();
		ArrayList<String> a5 = new ArrayList<String>();

		a1.add("for loop, while loop, do while loop\n");
		a2.add("Data type, Class, Object\n");
		a3.add("Array, ArrayList\n");
		a4.add("Encapsulation, Access Modifiers\n");
		a5.add("Framework Collections, Interface\n");

		ab.put(1, a1);
		ab.put(2, a2);
		ab.put(3, a3);
		ab.put(4, a4);
		ab.put(5, a5);

		for (Integer keys : ab.keySet())  
		{
		   System.out.print(keys + ":"+ ab.get(keys));
		}
		System.out.println();

		System.out.println("***  Comment / Rating each topic ***\n");
		ab.put(1, new ArrayList<String>());
		ab.put(2, new ArrayList<String>());
		ab.put(3, new ArrayList<String>());
		ab.put(4, new ArrayList<String>());
		ab.put(5, new ArrayList<String>());

		ab.get(1).add("I like it, basic stuff " + a1);
		ab.get(2).add("Still like it, quite basic " + a2);
		ab.get(3).add("I love the idea of Arrays " + a3);
		ab.get(4).add("Still good, not too  difficult " + a4);
		ab.get(5).add("Not bad, just need more practice " + a5);

		
		for (Integer keys : ab.keySet())  
		{
		   System.out.print(keys + ":"+ ab.get(keys));
		}

	}

}
