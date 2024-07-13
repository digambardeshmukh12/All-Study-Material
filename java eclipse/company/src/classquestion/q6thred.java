package classquestion;



class numbers{
	 void num(int a ,int b ) {
		 
		 System.out.println("Even numbers are ");
		
		for(int i = a ; i<=b ;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	 
	 
	 void odd(int a ,int b ) {
			
		 System.out.println("Odd numbers are ");
		 
			for(int i = a ; i<=b ;i++) {
				if(i%2!=0) {
					System.out.println(i);
				}
			}
		}
	
}


class thread1 extends Thread{
	numbers n ;
	
	thread1(numbers n){
		this.n=n;
	}
	
	public void run() {
		
		n.num(10,15);
	}
	
}

class thread2 extends Thread{
	numbers n ;
	
	thread2(numbers n){
		this.n=n;
	}
	
	public void run() {
		
		
		n.odd(45,50);
	}
	
}

public class q6thred {

	public static void main(String[] args) {
		
		numbers n1 = new numbers();
		thread1 td  = new thread1(n1);
		thread2 td2 = new thread2(n1);
		
		td.start();
		td2.start();
	
	}

}
