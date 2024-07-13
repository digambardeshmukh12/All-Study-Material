package collection_framework;

import java.util.*;

public class hashtabledemo {

	public static void main(String[] args) {

		Hashtable<Integer , String> map = new Hashtable<Integer , String>();
	

		map.put(100, "Indrajit");
		map.put(101, "Ravan");
		map.put(102, "Bali");
		map.put(103, "Akshay");
	
		for (Map.Entry m : map.entrySet() ) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		
		
		map.remove(102);
		System.out.println("After remove 102" );
		for (Map.Entry m : map.entrySet() ) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		
		
		
		
	} 

}
