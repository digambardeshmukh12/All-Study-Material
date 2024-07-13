package java8;

@FunctionalInterface
interface add {
	
	int show(int a , int b);
	
}

public class lambda3 {

	public static void main(String[] args) {
		
		add d = (X,Y)-> (X+Y);
		System.out.println("Addition = " + d.show(5, 5) );
		
	}
	
	
}
