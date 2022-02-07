package stringExamples;

import java.util.Scanner;

public class StringLen {
	
	public static void main(String args[])
	{
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		name=sc.nextLine();
		int l=name.length();
		System.out.println("Length of given String is : "+l);
		
		if(name.charAt(0)=='D')
		{
	System.out.println("Yes first letter is D");
		}
		
		char key='u';
		int total=0;
		for(int i=0;i<name.length();i++)
		{
			if(key==name.charAt(i))
			{
		//System.out.println(name.charAt(i));
		//total++;
			
			total++;
				if(total>1)
				{
					System.out.println("'u' precent in more than 1 time");
					break;
				}
			}
			
		}
		
		//System.out.println("'u' precent in "+total+" times");
		
		char[] ch=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
		System.out.println(ch[i]);
		}
		
		System.out.println(name.lastIndexOf('u'));
		System.out.println(name.indexOf('u'));
		
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		
		
		
		
		
	}

}

/*output

Enter the String : Dhanraj Arul
Length of given String is : 12

*/