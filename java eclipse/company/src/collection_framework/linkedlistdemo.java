package collection_framework;
import java.util.*;

public class linkedlistdemo {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<String>();
		
		li.add("Lucifer Morningstar");
		li.add("Linda Martin");
		li.add("Chloe Decker");
		li.add("Ella Lopez");
		li.add("EVE");
		System.out.println("Lucifer Cast "+li);
		
//		Adding elements to perticular elements 
		
		li.add(3 , "Mazikeen");
		
		System.out.println("After Changing "+li);
		
		
		
		LinkedList<String> li2 = new LinkedList<String>();
		
		
		li2.add("Raquel Murillo");
		li2.add("Nairobi");
		li2.add("Monika Gaztambide");
		li2.add("Alicia Sierra");
		
		System.out.println("\n\nMoney Heist Cast"+li2);
//		Adding Money heist cast to lucifer cast
		li.addAll(li2);
		
		System.out.println("\n\nAll  Cast "+li);
		
		System.out.println("\n\nRemoving elements  "+li2.removeFirst());
		System.out.println("\n\nAfter removing First elements in money heist "+li2);
		li2.addLast("Raquel Murillo");
		System.out.println("\n\nAfter adding last to money heist"+li2);
		
		System.out.println("\n\n All Data By Iterator" );
		
//		Using iterator 
		
		Iterator it = li.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	
	}

}
