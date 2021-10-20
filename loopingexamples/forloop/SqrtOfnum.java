package forloop;
//Square roots of 1 to 9 numbers

public class SqrtOfnum {

	public static void main(String[] args) {
		int num=9;
		  int sqrt;
		  
		  for(int i=1;i<=num;i++)
		  {
		  	sqrt=i*i;
		    System.out.println("sqrt of"+" "+i+"="+sqrt);
		    
		  }

	}

}

/*output:

sqrt of 1=1
sqrt of 2=4
sqrt of 3=9
sqrt of 4=16
sqrt of 5=25
sqrt of 6=36
sqrt of 7=49
sqrt of 8=64
sqrt of 9=81

*/