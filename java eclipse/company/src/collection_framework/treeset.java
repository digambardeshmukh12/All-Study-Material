package collection_framework;

import java.util.* ;

public abstract class treeset {

	public static void main(String[] args) {

		TreeSet <Integer> t1 = new TreeSet<Integer>();
		t1.add(23);
		t1.add(43);
		t1.add(24);
		t1.add(74);
		t1.add(93);
		
		
		System.out.println(t1);
		System.out.println("Size = " +t1.size());
		System.out.println("Is empty = " + t1.isEmpty());
		System.out.println(" Contains 24 = " +t1.contains(24));
		t1.remove(24);
		System.out.println(t1);
		
		t1.clear();
		
		
	}

}
