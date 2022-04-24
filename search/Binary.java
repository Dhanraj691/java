package samples;

import java.util.Random;
import java.util.Scanner;

public class Binary {
	
		
	public static void main(String[] args) {
		int n;
		
		Random rand=new Random();
		
		
			System.out.println("Enter the Digits: ");
			Scanner sc=new Scanner(System.in);
			 n=sc.nextInt();
			 int number[]=new int [n];
			 
			 for(int i=0;i<n;i++) 
				{
						number[i]=rand.nextInt(100);			
				}
			 
			 System.out.println("Unsorted Array: ");
			
			for(int i=0;i<n;i++) 
			{
					System.out.print(number[i]+" ");		
			}
			
		
		
		
			for(int i=0;i<n;i++)
			{
				int temp=0;
				for(int j=i+1;j<n;j++)
				{
					if(number[i]>number[j])
					{
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
					}
				}
			}
			
			System.out.println("\n"+"Sorted Array: ");
			
			for(int i=0;i<n;i++) 
			{
					System.out.print(number[i]+" ");		
			}
			
			int s=0;
			int e=number.length-1;
			System.out.println("\n"+"Enter key value");
			int key=sc.nextInt();
			
			while(s<=e)
			{
				int mid=(s+e)/2;
				if(key==number[mid])
				{
					System.out.println(key+" is present");
					break;
				}
				
				else if(key>number[mid])
					{
						s=mid+1;
					}
				else {
					e=mid-1;
					
				}
				
			}
			
			if(s>e)
			{
				System.out.println("\n"+key+" not found");
			}
		
		
		
		
	}

	
}


/*Output:
	
Enter the Digits: 
50
Unsorted Array: 
43 91 97 76 23 83 38 42 44 72 96 14 45 67 97 83 47 3 42 2 16 90 65 55 96 46 91 23 98 18 46 31 59 13 10 60 90 61 92 64 98 14 99 42 73 94 29 39 49 72 
Sorted Array: 
2 3 10 13 14 14 16 18 23 23 29 31 38 39 42 42 42 43 44 45 46 46 47 49 55 59 60 61 64 65 67 72 72 73 76 83 83 90 90 91 91 92 94 96 96 97 97 98 98 99 
Enter key value
42
42 is present

*/
	
