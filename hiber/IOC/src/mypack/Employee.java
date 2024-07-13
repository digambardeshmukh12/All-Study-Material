package mypack;

public class Employee {
	
	private int id ;
	private String name;
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		
		System.out.println("ID = " + id + "Name = " + name );
		System.out.println(address);
		
	}

}
