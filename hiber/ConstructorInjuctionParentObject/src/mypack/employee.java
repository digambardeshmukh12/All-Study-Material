package mypack;

public class employee extends person {
	
	int id ;
	int salary ;
	String cname;
	public employee(String name, double mob , int id, int salary, String cname) {
		super();
		this.id = id;
		this.salary = salary;
		this.cname = cname;
	}
	
	public void display() {
		System.out.println("id=" + id + " \n name ="+name + " \n Mobile no = " + mob);
		System.out.println("Salary = "+salary + "\n Company Name = "+cname);
	}
	
	

}
