public class Calculator
{
	public static void main(String ars[])
	{
		Calculator calcObj=new Calculator();
		int outcome=calcObj.add(50,55);
		
		calcObj.multiply(outcome);
		System.out.println(outcome);
	}
	
	public int add(int no1,int no2)
	{
		no1=15;
		no2=150;
		//int no1=50, no2=5;
		//System.out.println("Result is "+(no1+no2));
		return no1+no2;

	}
	
	public void multiply(int input)
	{
		System.out.println(input*10);
	}
	
	
}

