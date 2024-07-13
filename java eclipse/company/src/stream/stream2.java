package stream;

import java.util.*;

public class stream2 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Ravan");
		names.add("Karn");
		names.add("Lucifer");
		names.add("Iblis");
		names.add("Aghori");
		
		
//		 Using foreach loop 
		
		int count = 0 ;
		for(String str : names) {
			if(str.length()<6) {
				count++;
			}
		}
		System.out.println("There are " + count + " Strings with less then 6 letters ");
		
		
//		Using stream and lambda experssion
		
		long count1 = names.stream().filter(str->str.length()<6).count();
		System.out.println("There are " + count1 + " Strings with less then 6 letters ");
		
		
		
	}

}
