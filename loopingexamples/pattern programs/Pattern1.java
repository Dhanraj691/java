package nestedForloop;

public class Pattern1 {

	public static void main(String[] args) {
		int k=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i>=j)
				{
					if(i==j)
					{
					System.out.print(k);
					}
					else
					{
						System.out.print(k+"*");
					}
				}
			}
			k++;
			System.out.println();
		}

	}

}

/*Output:
1
2*2
3*3*3
4*4*4*4
*/

