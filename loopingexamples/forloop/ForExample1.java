package forloop;

public class ForExample1 {

	public static void main(String[] args) {
		ForExample1 fe=new ForExample1();
		fe.printFor();
		fe.printWhile();
		
		
	}



private void printWhile() {
	int row=1;
	int j=5;
	System.out.println("\n"+"While loop");
	while(row<=5)
	{
		int col=5;

		while(col>=j)
		{
			System.out.print(col+" ");
			col--;
			
		}
		j--;
		row++;
		System.out.println();
	}
		
	}



private void printFor() {
	int j=5;

	System.out.println("For loop");
	
	for(int row=1;row<=5;row++)
	{
		for(int col=5;col>=j;col--)
		{
			System.out.print(col+" ");
		}
		j--;
		System.out.println();
	}
		
		
	}

}

/*
 
 Output:
 
For loop
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 

While loop
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 


 */



