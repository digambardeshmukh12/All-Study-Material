package collection_framework;
import java.util.* ;

class set {
	int roll ;
	String name ;
	double per ;
	
	
	set(int roll , String name , double per){
		this.roll = roll ;
		this.name = name ;
		this.per =  per ;
		
	}


	@Override
	public String toString() {
		return "  \n set   [ roll=" + roll + ", name=" + name + ", per=" + per + "]";
	}
	
	
}


public class hashsetQue {

	public static void main(String[] args) {
		
		set s1 = new set(11 , "RAjAN" , 43.3);
		set s2 = new set(12 , "RAVAN" , 44.4);
		set s3 = new set(13 , "MEGHA" , 47.8);
		set s4 = new set(14 , "BALIKA" , 95.5);
		
		HashSet<set> t2 = new HashSet<set>();
		t2.add(s1);
		t2.add(s2);
		t2.add(s3);
		t2.add(s4);
		
	System.out.println( t2 );
		

	}

}
