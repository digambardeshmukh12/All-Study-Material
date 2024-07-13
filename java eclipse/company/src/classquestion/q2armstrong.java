package classquestion;


import static java.lang.Math.*;

abstract class arm {
	
	
	abstract void checker(int real);
}

class check extends arm {

	int dup  , mod = 0 , digit = 0 ;
	 
	double adde = 0;
	@Override
	void checker(int n) {
	
		dup = n  ;
		
		
		while(dup > 0) {
			dup = dup / 10 ;
			digit++ ;
		}
		
		
		
		dup = n  ;
		
		while(dup>0) {
			
			mod = dup % 10 ;
			adde += (pow(mod, digit));
			dup = dup / 10 ;
			
		}
		
		if(n == adde) {
			System.out.println("Armstrong number ");

		}
			else
			System.out.println("Not armstrong number ");
		
	}

	
	
}


public class q2armstrong {

	public static void main(String[] args) {
	
		System.out.println("Hello");
		arm ob = new check();
		ob.checker(151);
		
		
	}
}
