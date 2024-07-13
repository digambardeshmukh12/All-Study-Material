package company;

public class garb {
	
	public void finalize() {
		
	System.out.println("this is garbage collector");
	}
	
	public static void main(String[] args) {
		
		garb ob1 = new garb();
		ob1 = null ;
		
		garb ob2 = new garb();
		ob2 = null ;
		System.gc();
		
	}

}
