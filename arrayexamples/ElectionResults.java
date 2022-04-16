package arrayexamples;

import java.util.Scanner;

public class ElectionResults {

	public static void main(String[] args) {
		int candidates;
		int highvotes=Integer.MIN_VALUE;
		String winner="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("No of candidates: ");
		candidates=sc.nextInt();
		
		String []nominies=new String[candidates];
		int []votes=new int[candidates];
		
		for(int i=0;i<candidates;i++)
		{
			System.out.println("Enter Candidate name: ");
			nominies[i]=sc.next();
			System.out.println("Enter no of votes for "+nominies[i]+":");
			votes[i]=sc.nextInt();
			/*if(votes[i]>highvotes)
			{	
				highvotes=votes[i];
				winner=nominies[i];
			}*/
		}
		//System.out.println(winner+" is the winner with "+highvotes+" votes.");
		
		for(int i=0;i<candidates;i++)
		{
			int tmp=0;
			String stmp="null";
			for(int j=i+1;j<candidates;j++)
			{
				if(votes[i]<votes[j])
				{
					tmp=votes[i];
					votes[i]=votes[j];
					votes[j]=tmp;
					stmp=nominies[i];
					nominies[i]=nominies[j];
					nominies[j]=stmp;
					
				}
			}
		}
		
		System.out.println("****Election results****");
		
		for(int k=0;k<candidates;k++)
		{
		System.out.println(nominies[k]+" got "+votes[k]+" votes");
		}
		
		
		
		
		
	}

}



/*Output:
 No of candidates: 
5
Enter Candidate name: 
Ajith
Enter no of votes for Ajith:
5243
Enter Candidate name: 
Bala
Enter no of votes for Bala:
4521
Enter Candidate name: 
Chandran
Enter no of votes for Chandran:
6458
Enter Candidate name: 
Dinesh
Enter no of votes for Dinesh:
7485
Enter Candidate name: 
Ezhil
Enter no of votes for Ezhil:
3521
****Election results****
Dinesh got 7485 votes
Chandran got 6458 votes
Ajith got 5243 votes
Bala got 4521 votes
Ezhil got 3521 votes


  
 */

