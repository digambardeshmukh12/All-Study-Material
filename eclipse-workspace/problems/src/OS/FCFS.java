package OS;

import java.util.Scanner;

public class FCFS {
	
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int pid[] = null;
	int bt[] = null;
	int n ;
	System.out.println("Enter the number of processes");
	n = sc.nextInt();
	System.out.println("Enter the process ID of all processes");
	for(int i = 1 ; i<n;i++) {
		pid[i]= sc.nextInt();
	}
	
	System.out.println("Enter the Brust time  of all processes");
	for(int i = 1 ; i<n;i++) {
		bt[i]= sc.nextInt();
	}
	 
	int i , wt[] = null ;
	wt[0] = 0;
	
	for(i=1;i<n;i++) {
		wt[i]=bt[i-1]+wt[i-1];
	}
	
	
	System.out.println("Process ID      Brust Time      Waiting Time     turnAround Time\n");
	float twt = (float) 0.0;
	float tat = (float) 0.0;
	
	
	for(i=0;i<n;i++) {
		System.out.print("\t\t"+pid[i]);
		System.out.print("\t\t"+bt[i]);
		System.out.print("\t\t"+wt[i]);
		System.out.print("\t\t"+bt[i]+wt[i]);
		System.out.println();
		
		twt += wt[i];
		tat += wt[i]+bt[i];


	}
	
	float att , awt;
	awt = twt/n;
	
	att = tat/n;
	System.out.println("Avg. waiting time  " + awt);
	System.out.println("Avg. turnaround time" + att);
	

	
	
	
}
}
