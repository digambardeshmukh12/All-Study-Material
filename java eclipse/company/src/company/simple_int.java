package company;
import java.util.*;
public class simple_int {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double amount ;
		int years ;
		float interest ;
		
			System.out.println("Enter the total amount, No. of years and Interest ");
			amount = sc.nextDouble();
			years = sc.nextInt();
			interest = sc.nextFloat();
			
			
			float simpleint , totalamt ;
			
			simpleint = (float ) (amount*years*interest)/100 ;
			
			totalamt = (float) (simpleint+amount);
		
		System.out.println("Total Simple interest is " + simpleint);
		System.out.println("Total Amount  " + totalamt );
		
		
	}

}
