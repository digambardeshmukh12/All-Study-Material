package java8;
@FunctionalInterface
interface square {
	
	void show(int a);
	
}

public class lambdademo2 {

	public static void main(String[] args) {

		square d = (a)->{
			System.out.println("Square is = " + a*a);
		};
		
		d.show(6);
		
	}
}
