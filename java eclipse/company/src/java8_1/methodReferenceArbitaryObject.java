package java8_1;

import java.lang.reflect.Array;
import java.util.*;

public class methodReferenceArbitaryObject {

	public static void main(String[] args) {

		String [] stringarry = {"Ravan" , "Karn" , "Lucifer" , "Iblis" , "Aghori" };
		
		// Array.sort(stringarry , String :: compareToIgnoreCase);
		
		for(String str : stringarry) {
			System.out.println(str);
		}
		
	}

}
