package java8_1;

interface jack{
	void show(int a);
}
public class methouReference {

	void square(int x) {
		System.out.println("Square is " + x*x);
		
	}
	public static void main(String[] args) {
		
		methouReference obj1 = new methouReference();
		jack obj = obj1 :: square ;
		obj.show(7);
	
		
		
	}

}
