package collection_framework;


import java.util.* ;




class student{
	
	int roll , age ;
	String name ;
	
	student(int roll , String name , int age  ){
		
		this.roll = roll ;
		this.name = name ;
		this.age = age ;
		
	
	}
	
}

class namecomparator implements Comparator{
	
	public int compare(Object o1 , Object o2 ) {
		student s1  = (student) o1 ;
		student s2  = (student) o1 ;

		return s1.name.compareTo(s2.name);
		
	
	}
	
}

class agecomporetor implements Comparator{
	
	public int compare(Object o1 , Object o2 ) {
		student s1  = (student) o1 ;
		student s2  = (student) o1 ; 
	
		if(s1.age==s2.age)
			return 0 ;
		else if(s1.age>s2.age)
			return 1 ;
		else 
			return -1;
		
	
	}
}

/*
class rollcomporetor implements Comparator{
	
	public int compare(Object o1 , Object o2 ) {
		student s1  = (student) o1 ;
		student s2  = (student) o1 ; 
	
		if(s1.age==s2.age)
			return 0 ;
		else if(s1.age>s2.age)
			return 1 ;
		else 
			return -1;
		
	
	}
}


*/

public class comparitordemo {

	public static void main(String[] args) {
		
		
	
		ArrayList<student> l1 = new ArrayList<student>();
		
		l1.add(new student(101  , "Raj"  , 26 ));
		l1.add(new student(104  , "Ravan"  , 51 ));
		l1.add(new student(103  , "Indrajit"  , 61 ));
		l1.add(new student(102  , "Bali"  , 56 ));
		
		
		

		
		Collections.sort(l1, new agecomporetor());
		System.out.println("sorted elements based on age  ");
		Iterator itr1 = l1.iterator();
		while(itr1.hasNext()) {
			student sec = (student) itr1.next();
		
			System.out.println(sec.roll + " " + sec.name + " " + sec.age);
			
		}
		
		
		Collections.sort(l1, new namecomparator());
		System.out.println("sorted elements based on name  ");
		
		Iterator itr2 = l1.iterator();
		while(itr2.hasNext()) {
			student sec = (student) itr2.next();
			
			System.out.println(sec.roll + " " + sec.name + " " + sec.age);
		}
		
		
		
		/*
		 Collections.sort(l1, new rollcomporetor());
		System.out.println("sorted elements based on roll no  ");
		Iterator itr3 = l1.iterator();
		while(itr3.hasNext()) {
			student sec = (student) itr3.next();
		
			System.out.println(sec.roll + " " + sec.name + " " + sec.age);
			
		}
		 */
		
		
		
		
	}

}
