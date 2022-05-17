package maps;
import java.util.*;

public class StudentMarks extends Exception  {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("Dhanraj",360);
		hm.put("Raj",369);
		hm.put("Dhana",407);
		hm.put("Eliz",360);
		hm.put("Ravi",290);
		
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		boolean b=i.hasNext();
		try {
		while(b=true)
		{
			Object o=i.next();
			Map.Entry entry=(Map.Entry)o;
			System.out.println(entry.getKey()+" get "+entry.getValue()+" marks");
			b=i.hasNext();
		}
		}
		catch(Exception e)
		{
			System.out.println("Map is end...");
		}

	}

}
/*output:
Dhanraj get 360 marks
Ravi get 290 marks
Eliz get 360 marks
Raj get 369 marks
Dhana get 407 marks
Map is end...
*/
