package loopingexamples;

public class IncreaseAddition {

	public static void main(String[] args) {
		
		int i=2;
		int j=4;
		
		while(i<=32)
		{
			System.out.println(i);
			i=i+j;
			j++;
		}
		
	}

}

/* Output:

2
6
11
17
24
32

*/