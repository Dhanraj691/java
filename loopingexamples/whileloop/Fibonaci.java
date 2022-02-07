package loopingexamples;

public class Fibonaci {

	public static void main(String[] args) {
		int f=-1;
		int s=1;
		//int t=0;
		int i=1;
		
		
		while(i<=10)
		{
			
			//t=f+s;
			System.out.println(f+s);
			s=f+s;
			f=s-f;
			i++;
			
		}

	}

}

/* Output:

0
1
1
2
3
5
8
13
21
34

*/