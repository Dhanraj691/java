package forloop;
//Number perfectly dividing given number

public class PerfectDivide {

	public static void main(String[] args) {
		int num=16;
		  
		  int i=1;
		  for(;i<=num;i++)
		  {
		  	if(num%i==0)
		    {
		    System.out.print(i+" ");
		    }
		  }

	}

}

/*output:
 
1 2 4 8 16 

*/
