package stringExamples;

import java.util.Scanner;

public class Reverse {
 
	public static void main(String[] args) {
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		name=sc.nextLine();
		
		Reverse re =new Reverse();
		String result=re.reversedName(name);
		
		System.out.println(result);
		
		
		
		
		
	}

	private String reversedName(String name) {
		int space=0;
		String s1="",s2="",s3=" ";
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==' ')
			{
				s1=reversed(name,0,i-1);
				space=i;
				
				if(name.charAt(space)==' ')
				{
					s2=reversed1(name,space+1,name.length()-1);
				}
			}
		}
		
		
		return s1+s2;
	}

	private String reversed1(String name, int i, int j) {
		char a[]=name.toCharArray();
		//int i=0,j=name.length()-1;
		char temp;
		
		while(i<j)
		
			{
		
			 temp=a[i];
		
			 a[i]=a[j];
			 a[j]=temp;
				
				i++;
				j--;
			}
		String s=new String(a);
		return s;
		
	}

	private String reversed(String name,int i,int j) {
		
		
		char a[]=name.toCharArray();
		//int i=0,j=name.length()-1;
		char temp;
		
		while(i<j)
		
			{
		
			 temp=a[i];
		
			 a[i]=a[j];
			 a[j]=temp;
				
				i++;
				j--;
			}
		String s=new String(a);
		return s;
		
		
	}

}
