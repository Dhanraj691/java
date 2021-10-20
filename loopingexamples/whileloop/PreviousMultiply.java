package loopingexamples;

public class PreviousMultiply {

	public static void main(String[] args) {
		
		int i=2;
		int j=3;
		int sum=0;
		
		
		while(i<2000)
		{
			System.out.println(i);
			sum=(i*j);
			i=j;
			j=sum;
			
		}
		
		

	}
}

/* Output:

2
3
6
18
108
1944

*/