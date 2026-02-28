// write a program to store a name in the hard disk 
import java.io.*;
import java.util.*;
public class WriteNameToFile
{
	public static void main(String args[])
	{
		try	
		{
			FileWriter obj = new FileWriter("Student.txt", true);
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			for (int i = 0; i <= n; i++) 
			{
					System.out.println("Enter a Word");		
					String st = in.next();
					obj.write(st +"\n");
					System.out.println("Name Written Successfully");
			}
			obj.close();	
		
		}
		catch (IOException e) 
		{
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
}
