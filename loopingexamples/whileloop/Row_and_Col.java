package loopingexamples;

public class Row_and_Col {

		public static void main(String[] args) {
		Row_and_Col rc=new Row_and_Col();
		rc.first();
		rc.second();
		rc.third();
		

	}

	private void third() {
		
		int row=1;
		
		System.out.println();
		while(row<=4)
		{
			int col=3;
			
			while(col<=8)
			{
				
				System.out.print(col+" ");
				
				col++;
			}
			System.out.println();
		row++;
		}
		
	}

	private void second() {
		
		int row=1;
		
		System.out.println();
		while(row<=4)
		{
			int col=0;
			
			while(col<=6)
			{
				
				System.out.print(col+" ");
				
				col++;
			}
			System.out.println();
		row++;
		}
		
	}

	private void first() {
		
		int row=1;
		
		while(row<=4)
		{
			int col=1;
			
			while(col<=6)
			{
				
				System.out.print(col+" ");
				
				col++;
			}
			System.out.println();
		row++;
		}
		
		
	}

}
