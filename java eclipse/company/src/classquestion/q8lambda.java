package classquestion;

import java.util.Scanner;

interface intrest {
	
	void show (double amount , double intr , int years);
	
}

public class q8lambda {

	public static void main(String[] args) {
		
		
		
		intrest  d = (am , in , ye )->{
			System.out.println("Simple intrest = " +(am*in*ye) /100  );
		};
		
		d.show(5000, 6.5, 3);
	}
}
