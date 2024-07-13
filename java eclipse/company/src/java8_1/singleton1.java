package java8_1;

public class singleton1 {

	private static singleton1 obj ;
	
	private singleton1() {
		System.out.println("This is private constructor");
		
	}
	
	
	static singleton1 getInstance() {
		if(obj==null) {
			obj = new singleton1();
		}
		
		return obj;
		
	}
	public static void main(String[] args) {

		
		singleton1 o1 =  singleton1.getInstance();
		singleton1 o2 =  singleton1.getInstance();
		singleton1 o3 =  singleton1.getInstance();
		
	}

}
