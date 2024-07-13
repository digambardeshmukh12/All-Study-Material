package classquestion;

interface add {
	void addtion(int a , int b );
}

interface multi {
	void multiplication(int a , int b );
}

 class solution implements add , multi{
	
	
	
	
	public void multiplication(int a , int b ) {
		System.out.println("Multiplication = " + a*b);
	}


	@Override
	public void addtion(int a, int b) {
		System.out.println("Addition = " + (a+b));
		
	}
	
}

public class q1Inheritence {
	public static void main(String[] args) {
		
		solution obj = new solution();
		
		obj.addtion(4, 6);
		obj.multiplication(4, 5);
		
		
	}

}
