package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class file_input_stream {

	
	public static void main(String[] args) throws Exception  {

        FileInputStream fin = new FileInputStream("d:\\contact2.txt");
        FileOutputStream fout = new FileOutputStream("d:\\contact1.txt");

        int i ;
         while((i=fin.read())!=-1){
             fout.write((char)i);
             System.out.print((char) i);
         }
        System.out.println("data is successfully copied");

         fout.close();
         fin.close();
         
	}
}
