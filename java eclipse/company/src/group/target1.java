package group;

import java.util.Scanner;

public class target1 {

	public static void main(String[] args) {
		
		int target , n ,x = 0 ;
		System.out.println("How many numbers you want to entered");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();		
		int arr[] = new int[n];
		

		for(int a = 0 ;a<n;a++) {
			System.out.println("Enter number ");
			arr[a]=sc.nextInt();
		}
		
		for(int i = 0 ;i<n;i++) {
			System.out.print(arr[i]+ ",");
		}
		
		System.out.println("\nEnter target ");
		target = sc.nextInt();
		
		try {
		
		for(int i = 0 ;i<n;i++) {
			
			x= arr[i]+arr[i+1];
			if(x==target) 
				System.out.println(arr[i]+" "+ arr[i+1]);
		}
		
		if(x!=target) {
			System.out.println("Target is Not Exist ");
		}
		
		}
		catch(Exception e) {
			System.out.println("We known last index is array out of bound ");
		}
		
		
	}

}
