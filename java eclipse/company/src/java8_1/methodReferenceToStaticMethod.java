package java8_1;

interface demo11{
	void show(String s);
	
}

public class methodReferenceToStaticMethod {
	
	static void print(String s ) {
		System.out.println("My name is " + s);
		
	}

	public static void main(String[] args) {

		demo11 obj = methodReferenceToStaticMethod:: print;
		obj.show("Raj");
		
	}

}
