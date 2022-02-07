package loopingexamples;

public class NumberSequence {

	public static void main(String[] args) {
		int i=2;
		while(i<=14)
		{
			if(i%2==0||i%3==0)
			{
				System.out.println(i);
			}
			 i++;
		}

	}

}
/* Output:
2
3
4
6
8
9
10
12
14
*/