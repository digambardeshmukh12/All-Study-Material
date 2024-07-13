package collection_framework;

import java.util.* ;

public class hashset {

	public static void main(String[] args) {

		HashSet<String> h1 = new HashSet<String>();
		h1.add("raj");
		h1.add("Ravan");
		h1.add("Meghanath");
		h1.add("Bali");
		h1.add("Akshay");
		
		System.out.println(h1);
		System.out.println("Using ForEach loop");
		
		for (String s : h1) {
			System.out.println(s);

		}

		
		System.out.println("Using iterator");
		
		Iterator it = h1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

		}

		
	}

}
