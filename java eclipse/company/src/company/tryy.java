package company;

import java.util.Scanner;

public class tryy {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER HOW MANY NUMBERS YOU WANT TO ENTER IN ARRAY ");
		int a = sc.nextInt();
		
		int arr[] = new int[a];
		
		for (int i = 0 ; i<a;i++)
		{
			System.out.println("Enter a Number ");
			arr[i]=sc.nextInt();
			
		}
		
		System.out.print("your Entered Array is [");
		for(int i = 0 ; i<a ; i++){
			System.out.print(arr[i]+",");
		}	
		
		
		System.out.print("]\n");
		
		int newArray[] = new int[a];
		
		for(int i = 0 ; i<a;i++){
			int couty= 0 ;
			
			for(int j = 0 ; j<a;j++){
				
				
				if(arr[i]==newArray[j]){
					
					couty++;
					
				}	
			}
			
			if(couty==0){
				newArray[i]= arr[i];
				
			}
			else{
				newArray[i]=0;
				
			}
			
		}
		
		for(int i = 0 ; i<a ; i++){
			
			if(newArray[i]==0){
				newArray[i]=newArray[i+1];
				newArray[a-1]=0;
			}
		}	
		
		
		System.out.print("New Array ");
		
		for(int i = 0 ; i<a ; i++){
			if(newArray[i]==0){
				System.out.print("  _  ");
			}
			else{
				System.out.print(newArray[i]+"  ");
			}
			
		}	
		
		
	}
	
}
