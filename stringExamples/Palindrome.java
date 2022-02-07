package stringExamples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String word;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the word : ");
		word=sc.nextLine();
		
		int i=0,j=word.length()-1;
		boolean palindrome=true;
		
		while(i<j)
		{
			if(word.charAt(i)!=word.charAt(j))
			{
				System.out.println("Not palindrome");
				palindrome=false;
				break;
			}
			i++;
			j--;
		}
		
		if(palindrome)
		{
			System.out.println("Given word is palindrome");
		}
	}

}
