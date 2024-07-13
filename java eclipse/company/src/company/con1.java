package company;


class student {
	int rollno ;
	String name ;
	static String college = "ITS";
	
	student(int r , String n ){
		rollno = r ;
		name   = n ; 
	}
	
	void display() {
		System.out.println(rollno + " " + name + " " + college  );
	}
}

public class con1 {

	public static void main(String[] args) {
		
		student s1 = new student(111,"Pooja");
		student s2 = new student(112,"Payal");
		student s3 = new student(113,"Aditi");
		student s4 = new student(114,"Jyoti");
		
		
		
		
		
		s1.display();
		// we can change the college name of all objects by the single line of code
		student.college = "IIT";
		s2.display();
		s3.display();
		s4.display();
		

	}

}
