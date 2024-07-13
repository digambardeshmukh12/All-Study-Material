package java8;

import java.util.*;

public class lambda_with_list {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		li.add("Ravan");
		li.add("Karn");
		li.add("Bali");
		li.add("Indrajit");
		li.add("Duryodhan");
		
		li.forEach( (s) -> System.out.println(s) );
		
	}

}
