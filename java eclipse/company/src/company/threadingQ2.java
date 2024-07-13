package company;


class fibo extends Thread{
	
	public void run() {
		int a = 0, b=1 ,c, no = 8 ;
		System.out.println(a);
		System.out.println(b);
		for(int i = 0 ; i<=no ; i++ ) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
			
		}
	}
}


class reverse extends Thread{
	public void run() {
		
		for(int j = 10 ; j>=1;j--) {
			System.out.println("\t"+j);
			
			
		}
	}
}

public class threadingQ2 {

	public static void main(String[] args) {
		

		fibo obj1 = new fibo();
		reverse obj2 = new reverse();
		
		obj1.start();
		obj2.start();
		
		
	}

}
