package ifexamples;

public class Weather {
	Boolean raining=false;

	void checkWeather() 
	 {
		if(raining==true)
		{
		 
			System.out.println("Take umbrella");
	    }
		else
		{
			System.out.println("No need for umbrella");
		}
	 }
	public static void main(String[] args)
	{
		Weather reporter =new Weather();
		reporter.checkWeather();
		

	}

}
