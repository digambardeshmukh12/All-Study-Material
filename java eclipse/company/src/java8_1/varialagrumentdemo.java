package java8_1;

public class varialagrumentdemo {
public void add(int ...data) {
	System.out.println("\n length = " + data.length );
	for(int i = 0 ; i<data.length ; i++ ) {
		System.out.println(data[i] + " ");
	}
}
	public static void main(String[] args) {

		varialagrumentdemo ob = new varialagrumentdemo();
		ob.add(5,54,34,23);
		
		ob.add(5,54,34,43,2344,242,43,23);
		
		
	}

}
