package company;
import java.util.*;
public class forloopfac {
	
	public static void main(String[] args) {
		
		Scanner myobj = new Scanner(System.in);
		
		
		System.out.println("\n enter value");
		int a ;
		a=myobj.nextInt();
		int b ;
		long c=1 ;
		
		
		for(b=1;b<=a;b++) {
			
			c=c*b;
		}
		
		
		System.out.println("factorial is " + c);
	}

}
