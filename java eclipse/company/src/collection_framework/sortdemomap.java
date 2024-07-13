package collection_framework;

import java.util.* ;


public class sortdemomap {

	public static void main(String[] args) {


		SortedMap map = new TreeMap();
		
		map.put(100, "Indrajit");
		map.put(105, "Ravan");
		map.put(102, "Bali");
		map.put(103, "Akshay");
		
		System.out.println("Elements of " + map);
		
		
		System.out.println("First elements " + map.firstKey());
		
		System.out.println("Last elements " + map.lastKey());
		
		
		System.out.println("the sub elements  " + map.subMap(map.firstKey(),103));
		
//		submap last parameter indicates n-1 elements 
	}

}
