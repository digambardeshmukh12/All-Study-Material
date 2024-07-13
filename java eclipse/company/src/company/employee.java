package company;

public class employee {
	
	static String cname = " DHD PVT. LTD." ;
	int id ;
	String  ename ;
	void set(int id , String ename ) {
		
		this.id = id ;
		this.ename = ename ;
		
	}
	
	void show() {
		
		System.out.println("Employee ID is DHD"+ id + " & Its  Name is  "+ ename );
		
	}
	
	static void print() {
		System.out.println(" \n Company = "+ cname);
		
	}

	public static void main(String[] args) {
		

		employee ob1 = new employee();
		employee ob2 = new employee();
		employee ob3 = new employee();
		employee ob4 = new employee();
		
		ob1.set(1," raj Deshmukh");
		ob2.set(2," Rutuja pathak ");
		ob3.set(3," Komal Shinde ");
		ob4.set(4," Gajanan Sanap ");
		
		ob1.show();
		ob2.show();
		ob3.show();
		ob4.show();
		
		print();
		
		
		
	}

}
