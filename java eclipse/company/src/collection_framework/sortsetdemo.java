package collection_framework;

import java.util.* ;

public class sortsetdemo {

	public static void main(String[] args) {

		SortedSet set = new TreeSet();
		
		set.add("Audi");
		set.add("BMW");
		set.add("Mercedes");
		set.add("Jaguar");
		set.add("Royals");
		
		System.out.println("The list of elements ");
		for(Object ob : set) {
			System.out.println(ob);
		}
		
		
		System.out.println("First elements  : " + set.first());
		
		System.out.println("Last elements : " + set.last());
		
		
		System.out.println("The upper side  elements of given elements " + set.headSet("Jaguar"));
		
		System.out.println("The lower side elements of given elements " + set.tailSet("Jaguar"));
		
	}

}
