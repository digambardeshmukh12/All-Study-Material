package classquestion;

class parent {
	
	int x , y ;
	parent(int a , int b ){
		x = a ;
		y = b ;
		 
		if(a>b) {
			System.out.println("Maximum value is " + a);
			System.out.println("Minimum value is " + b);
		}
		
		else {
			System.out.println("Maximum value is " + b);
			System.out.println("Minimum value is " + a);
	
		}
		
	
	}
	
}

class child extends parent{

	child(int a, int b) {
		super(a, b);
		
	}
	
}

public class q4super {

	public static void main(String[] args) {

		child ob =  new child(45 ,70 );
		
	}

}
