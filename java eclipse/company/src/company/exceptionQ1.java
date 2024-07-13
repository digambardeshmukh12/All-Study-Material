package company;

import java.util.Scanner;

class IncorrectAgeException extends Exception{

	IncorrectAgeException(String s){
		super(s);
	}
}

class IncorrectNationalityException extends Exception{
	IncorrectNationalityException(String p){
		super(p);
	}
	
}

class voter {
	String name ;
	int age ;
	int nat ;
	
	
	
	Scanner sc = new Scanner(System.in);
	voter(){
		
		System.out.println(" Enter Your Age");
		this.age  = sc.nextInt();
		System.out.println(" Select following option \n 1.Indian \n 2.Foreigner ");
		this.nat  = sc.nextInt();
		
	}
	
	public void check(String name , int age  ) throws IncorrectAgeException, IncorrectNationalityException {
		
		int nat = 1 ;
		
		
		System.out.println("Your name is " + name);
		if(this.age < age) {
			throw new IncorrectAgeException("Age is Incorrect");
			}
		else {
			
			System.out.println("Your age is " + this.age );
			
		}
		
		 if(this.nat!=nat) {
			
			throw new IncorrectNationalityException("Nationality is Incorrect");
		}
		
		else {
			
		System.out.println("Your  Nationality is Indian and You can Vote ");
		}
	
	}

	@Override
	public String toString() {
		return "\n \n \n Please Next Voter";
	}

}
public class exceptionQ1 {
	
	public static void main(String[] args) throws IncorrectAgeException, IncorrectNationalityException {

	voter obj = new voter();
	
	obj.check("raj",17);
	
	System.out.println(obj);
	
	
	}
}
