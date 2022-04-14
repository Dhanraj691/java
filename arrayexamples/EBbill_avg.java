package arrayexamples;

import java.util.Scanner;

public class EBbill_avg {

	public static void main(String[] args) {
		int no_month;
		int total_amount=0;
		float  avg_amount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of months : ");
		no_month=sc.nextInt();
		String [] month= {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
		int[] Amount=new int[no_month];
		for(int i=0;i<no_month;i++)
		{
			System.out.println(month[i]+": ");
			Amount[i]=sc.nextInt();
			total_amount=total_amount+Amount[i];
			avg_amount=total_amount/no_month;
		}
		
		System.out.println("Total bill amount: "+total_amount);
		System.out.println("Average bill amount: "+avg_amount);

	}

}
