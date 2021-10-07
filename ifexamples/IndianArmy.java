package ifexamples;

public class IndianArmy 
{
	float age=17.8f;
	float height=163f;
	float weight=48f;
	float chest=76f;
	
	public void armyGD_physicalTest()
	{
		if(age>=17.5 && age<=21)
		{
			if(height>=163 && weight>=48 && chest>=77)
			{
				System.out.println("Selected...");
			}
			
			else
			{
				System.out.println("Rejected...");
			}

			
		}
		else
		{
			System.out.println("Canditate age must be between 17.5 years to 21 years");
		}

		
	}

	public static void main(String[] args)
	{
		IndianArmy ranger=new IndianArmy();
		ranger.armyGD_physicalTest();
		

	}



	

}
