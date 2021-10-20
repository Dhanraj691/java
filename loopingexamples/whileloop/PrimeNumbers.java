package loopingexamples;

public class PrimeNumbers {

	public static void main(String[] args) {
		int no=79;
		int i=2;
		boolean not_prime=false;
		
		while(i<no)
		{
			if(no%i==0)
			{
				
				not_prime=true;
				break;
			}
			
			i++;
		}
		
		if(not_prime==true)
		{
			System.out.println(no+" is not prime number");
		}
		else
		{
			System.out.println(no+" is prime number");
		}
		

	}

}

/* Output:
 
79 is prime number

*/
