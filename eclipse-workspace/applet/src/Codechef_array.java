
/******************************************************************************

//                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Codechef_array
{
	public static void main(String[] args) {
		System.out.println("Enter sizzze of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i<n;i++){
		    arr[i] = sc.nextInt();
		}
		int add =-1;
		for(int i = 0 ; i<n;i++){
		    if(arr[i]!=0){
		        add++;
		    }
		}
		System.out.println("Highest non zero index is " + add);
		
		
	}
}
