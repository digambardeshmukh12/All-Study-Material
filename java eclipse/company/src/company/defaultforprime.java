package company;

import java.util.Scanner;

public class defaultforprime {

	int a ,i , b=0 ;
	
	
	defaultforprime()
	{
		
		System.out.println("Enter number to check");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		if(a==0||a==1)
		{  
			   System.out.println(" is not prime number");  
		}
		
		for(i=2;i<a;i++) 
		{
			
			if(a%i==0) {
				System.out.println("its not prime ");
				b=1;
			break ;
						}
			    
		}
		
		
		if(b==0) 
		{
			System.out.println("its prime ");
		}
		
	}
	
	

	public static void main(String[] args) {
		

		defaultforprime obj = new defaultforprime();
		
		
		
		
	}

}
