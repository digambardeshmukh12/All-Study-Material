package collection_framework;

import java.util.*;
import java.util.Map.Entry;

public class treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer , String> map = new TreeMap<Integer , String>();
	map.put(100, "Indrajit");
	map.put(105, "Ravan");
	map.put(102, "Bali");
	map.put(103, "Akshay");
	
	for (Map.Entry m : map.entrySet() ) {
		System.out.println(m.getKey() + " " + m.getValue());
		
	}
	
	System.out.println( map.headMap(102));
	System.out.println( " TELL MAP "  + map.tailMap(102));
		
		
	}

}
