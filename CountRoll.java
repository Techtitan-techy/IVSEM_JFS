import java.io.*;
import java.util.*;
import java.io.IOException;
public class CountRoll
{
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		try
		{
			File obj1=new File("RollNumber.txt");
			//FileWriter obj2=new File("it.txt");
			//FileWriter obj3=new File("aiml.txt");
			//FileWriter obj4=new File("ds.txt");
			//FileWriter obj5=new File("ece.txt");
			Scanner sc = new Scanner(obj1);
			int cse = 0;
			int it = 0;
			int aiml = 0;
			int ds = 0;
			int ece = 0;
			while(sc.hasNextLine())
			{       
				String rollnumber=sc.nextLine();
				String br_code=rollnumber.substring(6,8);
				if(br_code.equals("05"))
					cse++;
				if(br_code.equals("12"))
					//obj2.write(rollnumber+"\n");
					it++;
				
				if(br_code.equals("66"))
					//obj3.write(rollnumber+"\n");
					aiml++;
				
				if(br_code.equals("67"))
					//obj4.write(rollnumber+"\n");
					ds++;
				if(br_code.equals("04"))
					//obj5.write(rollnumber+"\n");
					ece++;
			}
			sc.close();
			System.out.println(aiml + " " + cse + " " + it + " " + ds + " " + ece + " " );
			//System.out.print("Rollnumber written Successfully");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
	}
}
