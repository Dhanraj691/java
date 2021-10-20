package loopingexamples;

public class NumSequence_3_7_16_35_74 {

	public static void main(String[] args) {
		int i=3;
		int j=1;
		while(i<75)
		{
			System.out.println(i);
			i=(i*2)+j;
			j++;
			
		}

	}

}

/* Output:
 3
 7
16
35
74

*/

