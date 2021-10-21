package nestedForloop;


public class Pattern {

	public static void main(String[] args) {
		Pattern np=new Pattern();
		np.pattern1();
		np.pattern2();
		
		
	}

	public void pattern2() {
		for(int row=1;row<5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("V"+" ");
			}
			for(int i=1;i<=5-row;i++)
			{
			System.out.print("*"+" ");
			}
			for(int i=1;i<=5-row;i++)
			{
			System.out.print("*"+" ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print("A"+" ");
			}
			
			System.out.println();
		}
		
	}
	
	public void pattern1() {
		
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print("J"+" ");
			}
			for(int i=1;i<=6-row;i++)
			{
			System.out.print("*"+" ");
			}
			for(int i=1;i<=6-row;i++)
			{
			System.out.print("*"+" ");
			}
			for(int col=1;col<row;col++)
			{
				System.out.print("A"+" ");
			}
			
				
				System.out.println();
				
		}

		
		
	}

}

/*output:

J J J J * * A A A A 
J J J * * * * A A A 
J J * * * * * * A A 
J * * * * * * * * A 
* * * * * * * * * * 
V * * * * * * * * A 
V V * * * * * * A A 
V V V * * * * A A A 
V V V V * * A A A A 

*/

