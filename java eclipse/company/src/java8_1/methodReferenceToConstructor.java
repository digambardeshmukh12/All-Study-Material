package java8_1;

interface demo15{
	methodReferenceToConstructor show(int age);
	
}

public class methodReferenceToConstructor {

	methodReferenceToConstructor(int a){
		System.out.println("My age is " + a);
	}
	public static void main(String[] args) {

		demo15 obj = methodReferenceToConstructor::new;
		obj.show(21);
		
	}

}
