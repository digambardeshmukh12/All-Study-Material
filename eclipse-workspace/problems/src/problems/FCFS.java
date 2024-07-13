package problems;

import java.util.Scanner;

public class FCFS {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int pid[] = new int[15];
		int bt[] = new int[15];
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
		 
		int i , wt[] = new int[15] ;
		wt[0] = 0;
		
		for(i=1;i<n;i++) {
			wt[i]=bt[i-1]+wt[i-1];
		}
		
		
		System.out.println("Process ID      Brust Time      Waiting Time     turnAround Time\n");
		int twt =  0;
		int tat =  0;
		
		
		for(i=0;i<n;i++) {
			System.out.print(pid[i]);
			System.out.print("\t\t"+bt[i]);
			System.out.print("\t\t"+wt[i]);
			int x = bt[i]+wt[i];
			System.out.print("\t\t"+x);
			System.out.println();
			
			twt = twt + wt[i];
			tat = tat + (wt[i]+bt[i]);


		}
		
		int att , awt;
		awt = twt/n;
		
		att = tat/n;
		System.out.println("Avg. waiting time  " + awt);
		System.out.println("Avg. turnaround time" + att);
		

		

	}
}
