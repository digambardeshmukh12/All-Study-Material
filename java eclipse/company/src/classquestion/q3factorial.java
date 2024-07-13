package classquestion;

class find{
	void fact(int n)
	{
		int i,f=1;
    		for(i=1;i<=n;i++)
    		{
        		f=f*i;
    		}	
    		System.out.println("Factorial is " + f);
	}
}

public class q3factorial extends find {

	public static void main(String[] args) {

		find ob = new q3factorial();
		ob.fact(5);
	}

}
