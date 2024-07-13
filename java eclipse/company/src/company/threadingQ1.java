package company;

class one extends Thread{
	public void run() {
		
		for(int i = 10 ; i<=15;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(300);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}


class two extends Thread{
	public void run() {
		
		for(int i = 25 ; i>=20;i--) {
			System.out.println("\t"+i);
			
			try {
				Thread.sleep(300);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class threadingQ1 {

	public static void main(String[] args) {
		
		one ob1 = new one();
		two ob2 = new two();
		
		ob1.start();
		ob2.start();
		
	}

}
