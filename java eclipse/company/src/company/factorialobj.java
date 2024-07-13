package company;

import java.util.*;

class find {
	int a , fact =1 ;
	
	
	
	void fac() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for factorial");
		a = sc.nextInt();
		
		for(int x = 1 ; x<=a;x++) {
			
			fact = fact*x;
			
		}
		
		System.out.println("factorial of " + a +" is " + fact);
		
		
	}
	
	
	
}


public class factorialobj {
	
	public static void main(String[] args) {
		
		
		find f = new find();
		
		
		f.fac();
		
		
	}

}
