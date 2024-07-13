package company;

import java.util.*;
public class palindromewithwhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number whose check");
			long	a =sc.nextInt();
		
		long duplicate=a; 
		
		long reverse = 0, reminder ;
		
		while(a!=0) {
			
			reminder = duplicate % 10 ;
			reverse = reverse * 10 + reminder ;
			duplicate = duplicate / 10 ;	
			}
		
		
		if (a==reverse) {
			
			System.out.println("this is a palindrome number");
			
		}
		
		else {
			System.out.println("this is a palindrome number");
		}

	}

	
}
