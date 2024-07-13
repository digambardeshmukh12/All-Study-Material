package file_handling;

import  java.io.*;
public class buffer_input_straeam {

	public static void main(String[] args) throws Exception  {
		
		 FileInputStream fin = new FileInputStream("d:\\jammy.txt");
	        FileOutputStream fout = new FileOutputStream("d:\\jammy2.txt");


	        BufferedInputStream bin = new BufferedInputStream(fin );
	        BufferedOutputStream bout = new BufferedOutputStream(fout) ;



	        int i ;
	        while((i=fin.read())!=-1){
	            if (i<='z'&&i>='a')
	                i=i-32;
	            bout.write((char)i);
	            System.out.print((char) i);
	        }
	        System.out.println("  data is successfully copied");

	        bout.close();
	        bin.close();
	        fout.close();
	        fin.close();

		
	}
	
}
