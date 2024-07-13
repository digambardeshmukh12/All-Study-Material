package company;

import java.util.Scanner;

abstract class table {
	
	abstract void input();
	abstract void creat();
	
}

class absuse extends table {
	Scanner sc = new Scanner(System.in);
	int n ;
	void input() {
		
		System.out.println("Enter Number");
		n = sc.nextInt();
	}
	
	void creat() {
		
		for(int a = 1 ;a<=10;a++) {
			
			System.out.println(a*n);
		}
	}
	
}


public class abstract_demo_for_table {

	public static void main(String[] args) {
		

		table obj1 = new absuse();
		
		obj1.input();
		obj1.creat();
	}

}
