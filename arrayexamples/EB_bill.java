package arrayexamples;

import java.util.Scanner;

public class EB_bill {
				
	 static int no_of_months=12;
	 
	 String name;
	 int id;
	 
	 int AnnualAmount=0;	
	 int highest_amount=Integer.MIN_VALUE;
	 int lowest_amount=Integer.MAX_VALUE;
		
	 String highest_month="";
	 String lowest_month="";
	 int months;	
	 
	 Scanner sc=new Scanner(System.in);
		
	 String []month= {"January","February","March","April","May","June","July","August","September","October","November","December"};
	 int []Amount=new int[no_of_months];
		
	 public static void main(String[] args) {
		EB_bill eb=new EB_bill();
		eb.customerDetails();
		eb.billing();
		
		
		
	}
	

	 public  void customerDetails() {
		
		System.out.print("Enter customer name :");
		name=sc.nextLine();
		System.out.println();
		System.out.print("Enter customer id   :");
		id=sc.nextInt();
		System.out.println();
	}


	public  void billing() {
		
		
		System.out.print("Enter number of months : ");
		months=sc.nextInt();
		System.out.println();
		
		
		System.out.println("Enter Monthly bill amounts"+"\n");
		
		
		
		
		for(int i=0;i<months;i++)
		{
			System.out.print(month[i]+" :");
			Amount[i]=sc.nextInt();
			System.out.println();
			AnnualAmount=AnnualAmount+Amount[i];
			
			if(Amount[i]>highest_amount)
			{
				highest_amount=Amount[i];
				highest_month=month[i];
				
				
			}
			if(Amount[i]<lowest_amount)
			{
				lowest_amount=Amount[i];
				lowest_month=month[i];
			}
			
			
			
			
		}
	
		
		System.out.println("Total amount :"+AnnualAmount+"\n");
		System.out.println("Highest amount of "+highest_amount+" paid in "+highest_month+"\n");
		System.out.println("Lowest amount of "+lowest_amount+" paid in "+lowest_month);
			

	}

	}

/*output:

Enter customer name :Dhanraj A

Enter customer id   :691

Enter number of months : 10

Enter Monthly bill amounts

January :155

February :150

March :575

April :440

May :380

June :320

July :350

August :380

September :1160

October :620

Total amount :4530

Highest amount of 1160 paid in September

Lowest amount of 150 paid in February

 */


