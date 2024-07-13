package collection_framework;
import java.util.* ;

public class arraylist {

	
	public static void main (String [ ] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(3.4);
		list.add(5.5);
		list.add(7.6);
		list.add(3.4);
		list.add(8.4);
		
		System.out.println(list + "\n size" + list.size());
		System.out.println(list.get(0) + " " 
		+ list.indexOf(7.6) + " " + list.lastIndexOf(6.7));

	list.set(2,8.4);
	System.out.println(list);
	
	System.out.println(list.subList(0, 3));
	
	list.add(2 , 9.5);
	
	System.out.println(list);
	
	
	}
	
}
