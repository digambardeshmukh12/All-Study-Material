package java8;

@FunctionalInterface
interface demo {
	void  show();
	
}

public class lambdademo1  {

	public static void main(String[] args) {

		
		demo  d =  () ->{
			System.out.println("hello");
			
		};
		
		System.out.println("hello");
		d.show();
		
	}


	

}
