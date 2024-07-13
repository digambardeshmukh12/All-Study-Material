package collection_framework;

import java.util.ArrayList;

class set1 {
	int roll ;
	String name ;
	double per ;
	
	
	set1(int roll , String name , double per){
		this.roll = roll ;
		this.name = name ;
		this.per =  per ;
		
	}


	@Override
	public String toString() {
		return "  \n set   [ roll=" + roll + ", name=" + name + ", per=" + per + "]";
	}
	
	
}

public class arraylistQ {

	public static void main(String[] args) {

		set1 s1 = new set1(11 , "RAjAN" , 43.3);
		set1 s2 = new set1(12 , "RAVAN" , 44.4);
		set1 s3 = new set1(13 , "MEGHA" , 47.8);
		set1 s4 = new set1(14 , "BALIKA" , 95.5);
		
		ArrayList<set1> list = new ArrayList<set1>();
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println (list);
		
	}

}
