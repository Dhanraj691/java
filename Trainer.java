public class Trainer
{
	 String dept;
	 String institute;
	private int salary=10000;
	
	
	
	public Trainer(String dept, String institute)
	{
		this.dept=dept;
		this.institute=institute;
		System.out.print("Department name : "+dept+" Institute name : "+institute);
	}
	
	public int getSalary()
	{
		return this.salary;
	}
	
	public void training()
	{
		this.dept="Java";
		this.institute="Payilagam";
		System.out. println("We provid good training");
		
	}
	
public static void main(String args[])
{
	Trainer trainerKumar=new Trainer("CSE","Payilagam");
	
}
}