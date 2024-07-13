package company;

import java.util.Scanner;

class arthamatic{
	
	int a , b , result ;
	void input () {
		Scanner sc = new Scanner(System.in);		
		System.out.print("enter the 2 values  ");
		a = sc.nextInt();
		b = sc.nextInt();
		}
	
}
	
class subs extends arthamatic{
	
	
	void operation1() {
		result = a-b ;
		System.out.println(a + "-" + b + " = " + result );
		
	}
	
}


class add extends arthamatic{
	
	
	void operation2() {
		result = a+b ;
		System.out.println(a + "+" + b + " = " + result );
		
	}
	
}

class mult extends arthamatic{
	
	
	void operation3() {
		result = a*b ;
		System.out.println(a + "*" + b + " = " + result );
		
	}
	
}

class div extends arthamatic{
	
	
	void operation4() {
		result = a/b ;
		System.out.println(a + "/" + b + " = " + result );
		
	}
	
}
	
	


public class hirarchical_inheritence_arthamatik {
	
	public static void main(String[] args) {
		
		subs a = new subs();
		add  b = new add();
		mult c = new mult();
		div  d = new div();
		
		int e;
		Scanner sc1 = new Scanner(System.in);
		do {
		
		
		System.out.print("enter the number for \n 1.Substraction \n 2.Addition \n 3.Multiplication \n 4.Division \n 5.Exit \n Choose option  ");
		e = sc1.nextInt();
		 
		 if(e==1||e==2||e==3||e==4||e==5) {
			 
		 
		 switch(e) {
		
		case 1: a.input();
				a.operation1();
				break ;
				
		case 2: b.input();
				b.operation2();
				break ;
				
		case 3: c.input();
				c.operation3();
				break ;
		
		case 4: d.input();
				d.operation4();
				break ;
				
		
		case 5:
				break ;		
		}
		 
		}
		 
		 else 
			 System.out.println(" \n Choose Right Option \n ");
		 
		 }while(e!=5);
		
		
		
		
		
		
		
	}

}
