package loopingexamples;

public class PrimeNum_in_Fibonaci {
		int f=-1;
		int s=1;
		int i=1;
		int prime_or_not;

	public static void main(String[] args) {
		
		PrimeNum_in_Fibonaci pf=new PrimeNum_in_Fibonaci();
		pf.fibonacci();
		//pf.checkPrime(prime_or_not);
		
		

	}

	public  void checkPrime(int prime_or_not) {
		
		int i=2;
		boolean not_prime=false;
		
		if(prime_or_not==0 && prime_or_not==1)
		{
			
		}
		else if(prime_or_not!=0 && prime_or_not!=1)
		{
		
		while(i<prime_or_not)
		{
			if(prime_or_not%i==0)
			{
				
				not_prime=true;
				break;
			}
			
			i++;
		}
		if(not_prime==true)
		{
			//System.out.println(prime_or_not+" is not prime number");
		}
		else
		{
			System.out.print(prime_or_not+" ");
		}
		
		
	}
	}
	public void fibonacci() {
		
		System.out.println("***Prime numbers in first 10 Fibonacci numbers***"+"\n");
		
		while(i<=10)
		{
			
			
			prime_or_not=f+s;
			checkPrime(prime_or_not);			
			s=f+s;
            f=s-f;
			i++;
			
		}
		
	}

}

/* Output:

***Prime numbers in first 10 Fibonacci numbers***

2 3 5 13

*/
