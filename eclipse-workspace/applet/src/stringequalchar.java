import java.util.Scanner;

public class stringequalchar {

	 static void check(String s , String s2) {
		int k = 1;
		if(s.length()==s2.length()) {
			for(int i = 0 ; i<s.length();i++) {
				for(int j = 0 ; j<s2.length();j++) {
					if(s.charAt(i)==s2.charAt(j)) {
						k = 1 ;
					}
					else {
						k = 0 ;
					}
				}
				
			}
			
		}
		if (k==1) {
			System.out.println("contains");
		}
		else {
			System.out.println("Not ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String 1");
			String one = sc.nextLine();
			System.out.println("Enter String 2");
			String two = sc.nextLine();
			
			stringequalchar.check(one, two);

	}

}
