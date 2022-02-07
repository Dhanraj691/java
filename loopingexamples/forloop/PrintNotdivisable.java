package forloop;
//Numbers not divisible by 2, 3, 5

public class PrintNotdivisable {

	public static void main(String[] args) {
		 int num=20;

		  for(int i=1;i<=num;i++)
		  {
		  	if(i%2!=0 && i%3!=0 && i%5!=0)
		    {
		    System.out.println(i);
		    }
		    
		  }

	}

}

/*output:

1
7
11
13
17
19

*/