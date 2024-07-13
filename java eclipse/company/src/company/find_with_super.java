package company;

class square {
	
	int res;
	
	square(int a)
	{
		res = a*a ;
		System.out.println("Square of "+a+" is "+res);
	}
}

class qube extends square{
	
	qube( int a)
	{
		
		super(a);
		
		int res = a*a*a;
		
		System.out.println("qube of "+a+ " is "+ res);
		
	}
	
	
}

public class find_with_super {

	public static void main(String[] args) {
		

		qube ob = new qube(6);
	}

}
