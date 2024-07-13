package company;

import java.util.Scanner;



interface input1{
	 void inputA();
}


interface input2{
	 void outputA();
}

class alldata implements input1,input2 {
	
	Scanner sc = new Scanner(System.in);
	int a , b ;
	
	public void inputA() {
		System.out.println("enter first value");
		a=sc.nextInt();
		
		System.out.println("enter first value");
		b=sc.nextInt();
	}
	
	public void outputA() {
		
if(a>b) {
			
			System.out.println("Maxmium value = "+ a +" Minium value "+ b );
			
		}
		
		else
			System.out.println("Maxmium value = "+ a +" Minium value "+ b );
		
		
		
	}

	
		
	
	
	
	
	
}
public class max_min_value_interface_multiple_inheritence {
	public static void main(String[] args) {
		
		alldata obj = new alldata();
		obj.inputA();
		obj.outputA();
		
		
	}

}
