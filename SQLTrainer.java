public class SQLTrainer extends Trainer
{

	public SQLTrainer()
	{
	super("EEE","TCS");
	}
	
	public static void main(String args[])
	{
		SQLTrainer ram = new SQLTrainer();
		System.out.println("\n"+ram.dept);
		ram.training();
		System.out.println(ram.getSalary());
	}
	
}

/* output 

Department name : EEE Institute name : TCS
EEE
We provide good training
10000
*/
