import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite {
    public void ReadNameFromFile1(String name)
    {
        try {
            File file = new File(name);
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String name = in.nextLine();
                System.out.println(name);
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    public void WriteNameToFile1(String name) {
        try {
            FileWriter obj = new FileWriter("Student.txt", true);
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i <= n; i++) {
                System.out.println("Enter a Word");
                String st = in.next();
                obj.write(st + "\n");
                System.out.println("Name Written Successfully");
            }
            obj.close();

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ReadAndWrite obj = new ReadAndWrite();
        
        obj.WriteNameToFile1(name);

        obj.ReadNameFromFile1(name);
        
    }}
