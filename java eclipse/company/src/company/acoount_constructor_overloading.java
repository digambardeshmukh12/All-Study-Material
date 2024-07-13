package company;

import java.util.Scanner;

/*
  	Write an Account class with default constructor, parameterised constructor and 
	methods toString(), deposit(int amt), withdraw(int amt). withdraw method 
	should take care of insufficient balance. Accept the values from the user..Display
	the details of various Account
  
 */
class account{
	
	String customer_name  ;
	int account_no  , main_bal = 10000 ;
	int withdraw_amt , deposite_amt ;
	
	int func ;
	
	Scanner sc = new Scanner(System.in);
	
	
	
	account(String name , int accountno)
	{
		
		customer_name = name ;
		account_no = accountno ;
		account();
		
	}
	
	

	 void account() {
		
		 System.out.println("choose the function you have to do \n 1.Deposite \n 2.Withdrawal \n 3.Exit ");
			func = sc.nextInt();
			do{
			
			switch(func) 
			{
			
			case 1 : deposite();
					 break ;
			case 2 : withdraw();
					 break ;
			case 3 : break ;
			
			}
			}while(func!=3);
		
	}

	
	void deposite() {
		System.out.println("Enter the amount of Deposite");
		deposite_amt = sc.nextInt();
		main_bal = main_bal + deposite_amt ;
		
	}
	
	void withdraw() {
		
		
		System.out.println("Enter the amount of withdrawal");
		withdraw_amt = sc.nextInt();
		if(main_bal > withdraw_amt) {
		main_bal = main_bal - withdraw_amt;
		}
		else
			System.out.println("Insufficient balance");
		
	}

	@Override
	public String toString() {
		
		return "account [customer_name= " + customer_name + ", account_no= " + account_no + ", main_bal= " + main_bal
				+ "]";
	}
	
	
}


public class acoount_constructor_overloading {

	public static void main(String[] args) {
		

		account obj = new account("Rajkumar" , 992228);
			
		
		System.out.println(obj);
		
		
		
	}

}
