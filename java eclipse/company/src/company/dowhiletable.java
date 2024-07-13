package company;

import java.util.Scanner;

public class dowhiletable {
	
	
	public static void main(String[] args) {
		
		
		 Scanner myobj = new Scanner(System.in);

	        System.out.println("enter tha value ");
	        int c = myobj.nextInt();
	        int a = 1 ;

	        System.out.println("multiplication table is  ");
	        do {
	            System.out.println( a*c);
	            a++;
	        } while (a<=10);

		
		
	}

}
