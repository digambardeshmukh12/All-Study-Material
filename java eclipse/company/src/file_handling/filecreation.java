package file_handling;
import java.io.*;
public class filecreation {

	public static void main(String[] args) throws Exception {
		
		File f1 = new File("d:\\raj1.txt");
		// System.out.println("is file create "+ f1.createNewFile());

		File f2 = new File("d:\\raj");
		System.out.println(f2.mkdir());
		
		
		System.out.println("It is a file  "+f1.isFile());
		System.out.println("It is a file  "+f2.isDirectory());
		
		System.out.println("Length of f1 "+f1.length());

		File f3 = new File("d:\\digambar.txt");
		System.out.println("Renamed? "+f1.renameTo(f3));
		
		System.out.println("Path of f3 "+f3.getAbsolutePath());
		System.out.println("Path of f3 "+f3.getPath());
		
		System.out.println("Length of f3 "+f3.length());
		
		
	}

}
