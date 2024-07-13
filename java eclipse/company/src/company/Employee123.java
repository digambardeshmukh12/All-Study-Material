package company;

import java.util.Scanner;

class WageEmployee{
	
	int sales ;
	int commission ;
	int sallary ;
	
	Scanner sc = new Scanner(System.in);
	
	
	void ComputeSalary(String name , int sal) 
	{
		System.out.println("enter the sales by employee");
		sales = sc.nextInt();
		commission = sales*20;
		sallary =sal+commission ;
		System.out.println("The name of employee is " + name + " and is sallary is "+sallary  );
		System.out.println("Its sales are "+ sales + " and ist commision is "+ commission );
		
	}
	
}

class SalesPerson extends WageEmployee{
	
		void ComputeSalary(String name , int sal) 
		{
		
				super.ComputeSalary(name ,sal);
		
		}
	
	
}

public class Employee123 {

	public static void main(String[] args) {
		
		
		SalesPerson obj = new SalesPerson();
			obj.ComputeSalary("ram",10000);
	}

}
