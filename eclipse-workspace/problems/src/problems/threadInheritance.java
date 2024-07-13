package problems;
class A extends Thread{
	
	public void run() {
	System.out.println("Task One");	
	}
}

class B  extends A {
	public void run() {
		System.out.println("Task Two ");
	}
}
public class threadInheritance {

	public static void main(String[] args) {
		
		A a = new A();
		a.start();
		B b = new B();
		b.start();

	}

}
