import java.io.*;
import java.util.*;
public class ReadNameFromFile
{
	public static void main(String args[]){
		try {
			File file = new File("WriteNameToFile.java");
			Scanner in = new Scanner(file);
			while(in.hasNextLine()){
				String name = in.nextLine();
				System.out.println(name);
			}
			in.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}
	}
}
