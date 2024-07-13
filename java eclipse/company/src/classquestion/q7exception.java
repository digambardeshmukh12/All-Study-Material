package classquestion;

import java.util.Scanner;



class IncorrectAgeException extends Exception{

	IncorrectAgeException(String s){
		super(s);
	}
}

class ckeck1{
	int age ;
	Scanner sc = new Scanner(System.in);
	
		
	
	public void check() throws  IncorrectAgeException {
		
		System.out.println(" Enter Your Age");
		
		this.age  = sc.nextInt();
	
	
		if(this.age > 0 && this.age <120 ) {
			System.out.println("Your age is may be correct");
		}
		
		else {
			throw new IncorrectAgeException("Age is Incorrect");
		}
	}
	
	
}

public class q7exception {

	public static void main(String[] args) throws IncorrectAgeException {
		

		ckeck1 ob = new ckeck1();
		
		ob.check();
	}

}
