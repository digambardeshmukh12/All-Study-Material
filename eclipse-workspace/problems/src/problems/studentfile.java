package problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
		String filePath = "D:\\EDUCATIONAL\\all extra edj\\demo.txt";
		try {
			FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
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
				String str = roll + " " + name  + " "+ address + "\n";
				bufferedWriter.write(str);
				System.out.println("Student add Succesfully");
				bufferedWriter.close();
				break;
			case 2 : 
				System.out.println("Enter roll No of student");
				String del = sc.next();
				
				
					FileReader fileReader = new FileReader(filePath);
		            BufferedReader bufferedReader = new BufferedReader(fileReader);
		            String line;
		            while ((line = bufferedReader.readLine()) != null) {
		                if (line.contains(del)) {
		                    
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
