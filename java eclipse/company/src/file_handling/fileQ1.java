package file_handling;

import java.io.*;


public class fileQ1 {

	public static void main(String[] args) throws Exception {
		
		
		 int id ;
	        String name ;
	        double sal ;

	        BufferedReader bin =new BufferedReader( new InputStreamReader(System.in));

	        System.out.println("Enter ID , Name And Sallary (Each point add in new line )");

	        id = Integer.parseInt(bin.readLine());
	        name = bin.readLine();
	        sal = Double.parseDouble(bin.readLine());

	        FileOutputStream fout = new  FileOutputStream("d:\\jammy.txt");

	        DataOutputStream dout =new DataOutputStream(fout);
	        
	        dout.writeInt(id);
	        dout.writeUTF(name);
	        dout.writeDouble(sal);

	        System.out.println("Data write succesfully");


	        FileInputStream iout = new  FileInputStream("d:\\jammy.txt");

	        DataInputStream sout =new DataInputStream(iout);

	        System.out.println(sout.readInt() + " "+ sout.readUTF() + " " + sout.readDouble());



	        sout.close();
	        iout.close();
	        dout.close();
	        fout.close();
	       


	}

}
