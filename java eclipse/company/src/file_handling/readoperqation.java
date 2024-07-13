package file_handling;
import java.io.*;
public class readoperqation {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("d:\\contact.txt");
			
			int i = fin.read();
			while(i!=-1) {
				System.out.print((char) i);
				i=fin.read();
				
			}
			
			fin.close();
			
		}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		
		
	}
}
