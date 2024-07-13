package Kanini;


import java.util.*;

public class Kanini1 {

	public static void main(String[] args) {
		int n ;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] array = new int[n*3];
		for(int i = 0 ; i<n*3;i++) {
			array[i] = sc.nextInt();
			array[i+1] = array[i] * array[i] ;
			array[i+2] = array[i] * array[i] * array[i] ;
			i = i+2;
		}
		for(int i = 0; i<n*3;i++) {
			System.out.print(array[i] + "-" + array[i+1] + "-" + array[i+2] + "-@");
			i = i+ 2;

		}
		
		
		
	}

}
