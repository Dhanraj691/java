package loopingexamples;

public class PatternWhile {
	
	// int count=1;
	 //int i=1;

	public static void main(String[] args) 
		{
		PatternWhile pw=new PatternWhile();
		pw.printNumbers();
		pw.printStars();
		
		}

	private void printStars() {
		
		int count=1;
		 int i=1;
		 
		 System.out.println();
		 
		while(count<=5)
		{
			int no=5;
			
			while(no>=i)
			{
				
				System.out.print("*"+" ");
				
				
				no--;
			}
			System.out.println();
			i++;
		count++;
		}
		
	}

	private void printNumbers() {
		
		int count=1;
		int i=1;
		
		while(count<=5)
		{
			int no=5;
			
			while(no>=i)
			{
				
				System.out.print(no+" ");
				
				
				no--;
			}
			System.out.println();
			i++;
		count++;
		}
		
	}

}
/* Output:

5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 

* * * * * 
* * * * 
* * * 
* * 
* 


*/