package osalgo;

import java.util.LinkedList;
import java.util.Scanner;

public class fcfs {
public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of process");
	int n = sc.nextInt();
	int AT , BT ;
	LinkedList<Integer> Arrival = new LinkedList<>();
	LinkedList<Integer> Brust = new LinkedList<>();
	
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter arraval time");
		AT = sc.nextInt();
		Arrival.add(AT);
		
		System.out.println("Enter Brust time");
		BT = sc.nextInt();
		Brust.add(BT);
	}
	
	System.out.println(Arrival);
	System.out.println(Brust);
	
	
}
}
