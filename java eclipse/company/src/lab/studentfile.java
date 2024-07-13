package lab;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class make{
	int roll;
	String name;
	String Address;
	
	
	make(int roll, String name, String Address){
		this.roll = roll;
		this.name = name ;
		this.Address=Address ;
		}
	
	public void show () {
		System.out.println(roll + " " + name + " " + Address  );}
	}

public class studentfile {
	public static void main(String [] args) {
		List<make> std = new ArrayList<>();
		try {
		FileOutputStream fout = new  FileOutputStream("D:\\EDUCATIONAL\\all extra edj\\demo.txt");
		DataOutputStream dout =new DataOutputStream(fout);
		Scanner sc = new Scanner(System.in);
			boolean run = true ;
			while(run) {
				System.out.println("Chooes Operation on file \n 1. Add new Student \n 2.delete student "
						+ "\n 3.Show all Student Details \n 4.Exits \n Enter Your choice ");
				int choice = sc.nextInt();
				int roll;
				String name , address;
			switch(choice) {
				case 1:
				System.out.println("Enter Student roll ");
				roll = sc.nextInt();
				System.out.println("Enter Student name ");
				name = sc.next();
				System.out.println("Enter student address");
				address = sc.next();
				make s = new make(roll,name,address);
				std.add(s);
				
				dout.writeUTF(roll + " " + name  + " "+ address + "\n");
				System.out.println("Student add Succesfully");
				break;
			case 2 : 
					System.out.println("Enter roll No of student");
					int del = sc.nextInt();
					Iterator<make> iterator = std.iterator();
					boolean found = false;
					while(iterator.hasNext()) {
						make k = iterator.next();
						if(k.roll==del) {
							iterator.remove();
							found = true ;
							System.out.println("Student Deleted Succesfully");
							break;
						}
					}
					break;
				case 3 :
					
					if(std.isEmpty()) {
						System.out.println("No student Found");
					}
					else {
						for(make m : std) {
							m.show();
						}
					}
				break ;
					
				case 4 :
					System.out.println("Thank you");
					run = false;
					break;
			}
				
			}
			
			
		}catch (Exception e) {
			System.out.println(e);
			
		}
		
	}
}
