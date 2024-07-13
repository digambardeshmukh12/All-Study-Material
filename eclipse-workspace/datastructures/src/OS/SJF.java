package OS;

import java.util.Scanner;

public class SJF {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int bt[] = new int[20];
		int p[] = new int[20];
		int wt[] = new int[20];
		int tat[] = new int[20];
		int i , j , n , total = 0 , totalIT = 0 ,pos , temp ;
		float avg_wt , avg_tat;
		System.out.println("Enter no of processes");
		n = sc.nextInt();
		
		System.out.println("Enter Brist time of processes");
		for(i=0;i<n;i++) {
			System.out.println("p" + i+1 );
			bt[i]= sc.nextInt();
			p[i]=i+1;
		}
		
		for(i=0;i<n;i++) {
			pos = i;
			for(j=i+1;j<n;j++) {
				if(bt[j]<bt[pos])
					pos=j;
			}
			
			temp = bt[i];
			bt[i] = bt[pos];
			bt[pos]= temp;
			
			temp = p[i];
			p[i] = p[pos];
			p[pos]=temp;
			
		}
		
		wt[0] = 0;
		
		for(i=1;i<n;i++) {
			wt[i]=0;
			for(j=0;j<i;j++)
				wt[i]+=bt[j];
				
			total += wt[i];
		}
		avg_wt =(float) total/n;
		System.out.println("\n Process \t Brust Time \t Waiting Time \t Turnaround time");
		for(i=0;i<n;i++) {
			tat[i]=bt[i]+wt[i];
			totalIT +=tat[i];
			System.out.println("\nP" + p[i]+ "\t\t "+bt[i] + "\t\t" + wt[i] + "\t\t\t" + tat[i]);
		}
		
		
		
		
		avg_tat = totalIT/n;
		System.out.println("Average waiting time " + avg_wt);
		System.out.println("Average Turnaround time " + avg_tat);
		
		
		
	}
}