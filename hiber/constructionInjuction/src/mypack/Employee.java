package mypack;

public class Employee {

	private int id ;
	private String name;
	private double sal ;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	} 
	
	public void  display() {
		
		System.out.println(id + " " +name + " " +sal );
		
	}
	
	
	
}
