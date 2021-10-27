package arrayexamples;

public class BubbleSort {
	
	String []name= {"Dhanraj","Raj","Kamal","Vimal"};
	int []age= {21,25,19,22};
	

	public static void main(String[] args) {
		BubbleSort bs=new BubbleSort();
		System.out.println("Ascending Order :");
		bs.ascending();
		System.out.println("Discending Order :");
		bs.discending();	
			
			
			
			
	}


	private void discending() {
		for(int i=0;i<name.length;i++)
		{
			int tmp=0;
			String stmp=null;
			for(int j=i+1;j<name.length;j++)
			{
				if(age[i]<age[j])
				{
					tmp=age[i];
					age[i]=age[j];
					age[j]=tmp;
					stmp=name[i];
					name[i]=name[j];
					name[j]=stmp;
				}
			}
		}
		int i=0;
		while(i<name.length)
		{
			System.out.println(name[i]+" : "+age[i]);
			i++;
		}
		
	}


	private void ascending() {
		for(int i=0;i<name.length;i++)
		{
			int tmp=0;
			String stmp=null;
			for(int j=i+1;j<name.length;j++)
			{
				if(age[i]>age[j])
				{
					tmp=age[i];
					age[i]=age[j];
					age[j]=tmp;
					stmp=name[i];
					name[i]=name[j];
					name[j]=stmp;
				}
			}
		}
		int i=0;
		while(i<name.length)
		{
			System.out.println(name[i]+" : "+age[i]);
			i++;
		}
	}

}
