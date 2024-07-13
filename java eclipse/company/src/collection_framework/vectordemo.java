package collection_framework;
import java.util.*;
public class vectordemo {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		
//		 Adding elements using add 
		
		v.add("Lucifer Morningstar");
		v.add("Linda Martin");
		v.add("Chloe Decker");
		v.add("Ella Lopez");
		v.add("EVE");

		System.out.println(v);
		
		
//		 Adding elements using addElements
		
		v.addElement("Nairobi");
		v.addElement("Berlin");
		
		System.out.println("After adding elements "+v);
		
//		 vector without adding elements type 
		
		Vector v2 = new Vector();
		v2.add(53);
		v2.add(533.3);
		v2.add("RAVAN");
		v2.add('a');
		System.out.println(v2);
		
		
		v.addAll(v2);
		
		System.out.println("/n/n/n After adding second vector in first vector"+v);
		
		
	}

}
