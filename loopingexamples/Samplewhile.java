package loopingexamples;

public class Samplewhile 
{	
	
	
	void normalLoop(int number)
	{
		System.out.println("Forward loop...");
		while(number<=25)
		{
			System.out.println(number);
			number=number+5;
			
		}
	
	}
	
	void reverseLoop(int number)
	{
		System.out.println("Backward loop...");
		while(number>=5)
		{
			System.out.println(number);
			number=number-5;
			
		}
	
	}
	public static void main(String[] args) 
	{	
		Samplewhile s=new Samplewhile();
		s.normalLoop(5);
		s.reverseLoop(25);
		
		 
		
	}

}

/* Output:

Forward loop...
5
10
15
20
25
Backward loop...
25
20
15
10
5

*/
