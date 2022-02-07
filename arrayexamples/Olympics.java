package arrayexamples;

import java.util.Scanner;

public class Olympics {
	static int no_athlete;
	public static void main(String[] args) {
	
		float highspeed=Float.MAX_VALUE;
		float lowestspeed=Float.MIN_VALUE;
		String winner="";
		String lastAthlete="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Athletes :");
		no_athlete=sc.nextInt();
		
		System.out.println("Enter Athlete names");
		
		String []runners=new String[no_athlete];
		for(int i=0;i<runners.length;i++)
		{
			runners[i]=sc.next();           //nextLine
		}
		
		System.out.println("Enter time laps");
		
		float []time_laps=new float[no_athlete];
		for(int i=0;i<time_laps.length;i++)
		{
			System.out.print(runners[i]+" :");
			
			time_laps[i]=sc.nextFloat();
			
			if(time_laps[i]<highspeed)
			{
				highspeed=time_laps[i];
				winner=runners[i];
			}
			
			if(time_laps[i]>lowestspeed)
			{
				lowestspeed=time_laps[i];
				lastAthlete=runners[i];
			}
			
		}
		
		System.out.println();
		System.out.println("Winner of the event "+winner+" done by "+highspeed+"sec");
		System.out.println();
		System.out.println("Last of the event "+lastAthlete+" done by "+lowestspeed+"sec");
		System.out.println();
		
		
		for ( int i = 0; i < no_athlete; i++) {
            for (int j = i + 1; j < no_athlete; j++) {
                float dtmp=0;
                String stmp=null;
                if (time_laps[i] > time_laps[j]) {
                    dtmp = time_laps[i];
                    time_laps[i] = time_laps[j];
                    time_laps[j] = dtmp;
                    stmp = runners[i];
                    runners[i]=runners[j];
                    runners[j]=stmp;
                }
            }
        }
		
		System.out.println("Second of the event "+runners[1]+" done by "+time_laps[1]+"sec");
		System.out.println();
		System.out.println("Event results");
		int sno=1;
		for(int i=0;i<no_athlete;i++)
		{
			
			System.out.println(sno+". "+runners[i]+" : "+time_laps[i]);
			sno++;
		}
					
					
		

	
		}

}

/*output:

Enter number of Athletes :
7
Enter Athlete names
Raj
Siva
Mubarak
Ravi
Rajesh
Murugan
Bolt
Enter time laps
Raj :11
Siva :10.2
Mubarak :10
Ravi :11.2
Rajesh :12
Murugan :10.9
Bolt :9.58

Winner of the event Bolt done by 9.58sec

Last of the event Rajesh done by 12.0sec

Second of the event Mubarak done by 10.0sec

Event results
1. Bolt : 9.58
2. Mubarak : 10.0
3. Siva : 10.2
4. Murugan : 10.9
5. Raj : 11.0
6. Ravi : 11.2
7. Rajesh : 12.0



 */


