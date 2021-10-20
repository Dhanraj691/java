package forloop;
//Sum of first n even numbers

public class SumofEven {

	public static void main(String[] args) {
		int n=10;
		int sum=0;
		int i=0;
		   for(;i<=n;i+=2)
		   	{
			   sum=sum+i;
		   	}  
		   	System.out.println(sum);
	}

}

/*output
 
 30
 
*/