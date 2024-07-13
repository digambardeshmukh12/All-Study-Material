package classquestion;

import java.util.Scanner;

public class q5string {

	public static void main(String[] args) {
		
		String str;
	      int len=0;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the String: ");
	      str = scan.nextLine();
	      
	      String words[] = str.split(" ");
	      for(String token : words) {
	         System.out.println(token + " = " + token.length());
	      }
	      
	     
	      
	  
	    	  
	      
	     
	}

}
