package loopingexamples;

public class Firstloop 
{
	
	
	void printNum(int value)
	{
		do
			{	
				System.out.println(value);
				value=value+3;
		
			}while(value<=15);
	}
	

	public static void main(String[] args) 
	{
		Firstloop fl=new Firstloop();
		fl.printNum(1);
		
	}

}

/* Output:

1
4
7
10
13

*/
