package group;

import java.util.Scanner;

public class arrayDup {

	public static void main(String[] args) {
		
		
		int a;
		int s = 0 ;
		System.out.print("Entr how many numbers you want to enter in array ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		int arr[] = new int[a];
		for(int i = 0 ; i<a;i++) {
			System.out.print("Enter Number ");
			arr[i] = sc.nextInt();
			
		}
		
		
		for(int i = 0 ; i<a;i++) {
			System.out.print(arr[i]+",");
		}
		
		
		int newarr[] = new int[a];
		
		
		for(int i = 0 ; i<a;i++) {
			int count=0 ;
			for(int j = 0 ; j<a;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
		
			if(count==0) {
				newarr[s]=arr[i];
				s++;
			}
			else {
				arr[s]=0;
				s++;
			}
			
			
		}
		
		
		System.out.println("");
		
		for(int i = 0 ; i<a;i++) {
			System.out.print(arr[i]+",");
		}
		
		

	}

}
