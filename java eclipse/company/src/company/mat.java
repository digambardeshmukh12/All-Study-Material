package company;




public class mat {
	
	public static void main(String[] args) {
		
		int a [][] = { { 2,3 }, { 4,5 } };
	    int b [][] = { { 2,3 }, { 4,5 } };
		
		int c[][] = { { 0,0} , { 0,0 } };
		
		int  s , g ;
		
		
		
		for (s=0;s<2;s++) {
			for(g=0;g<2;g++) {
				
				
				
				c[s][g]=a[s][g]+b[s][g];
			
			System.out.print(" "+c[s][g] );
			
			}
			
			System.out.println("");
			
		}
		
		
		
	}

}
