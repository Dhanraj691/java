package stringExamples;

import java.util.Scanner;

public class LetterCount {

	public static void main(String[] args) {
		String word;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word : ");
		word=sc.nextLine();
		
		char []letters= new char[word.length()];
		int []frequency=new int[word.length()];
		int index=0;
		
		for(int i=0;i<word.length();i++)
		{
			int count=0;
			char ch=word.charAt(i);
			for(int j=0;j<word.length();j++)
			{
				if(word.charAt(j)==ch)
				{
					count++;
				}
			}
			letters[i]=ch;
			frequency[i]=count;
			
			for(int k=i+1;k<word.length();k++)
			{
				if(word.charAt(i)==word.charAt(k))
				{
					frequency[i]=-5;
				}
			}
			
			
			
				
				/*if(frequency[i]==1)
				{
						if(word.charAt(i)!=' ')
						{
			System.out.println(word.charAt(i)+" is appear "+frequency[i]+" time");
						}
				}*/
				
				
			}
		
		int max=Integer.MIN_VALUE;
		
		for(int high_val=0;high_val<frequency.length;high_val++)
		{
				if(frequency[high_val]>max)
				{
					max=frequency[high_val];
					index=high_val;
				}
			
		}
		
		System.out.println("Most Repeated letter is "+word.charAt(index)+" at "+max+" times");
		//System.out.println("Most repeated letter is "+word.charAt(index));
				
				
		
		
		
	}

}
