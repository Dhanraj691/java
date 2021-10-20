package loopingexamples;

public class AddingJplus2 {

	public static void main(String[] args) {
		int i=121;
		int j=23;
		int sum=0;
		
		while(i<230)
		{
			System.out.println(i);
			sum=i+j;
			i=sum;
			j=j+2;
			
		}

	}

}

/* Output:

121
144
169
196
225

*/
