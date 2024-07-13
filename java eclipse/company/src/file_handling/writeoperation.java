package file_handling;

import java.io.*;

import java.util.Scanner;


public class writeoperation {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream output1 = new FileOutputStream("d:\\jammy.txt", true);
		
		/*
		 Here "true" indicates its a append mode (A), when we remove "true" its convert into write mode.
		 propertyes of append and write mode are same as c languages.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data ");
		String s = sc.nextLine();
		
		byte b[] = s.getBytes();
		output1.write(b);
		
		System.out.println("Data written Sussessfully");
		output1.close();
		
	}

}
