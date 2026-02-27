import java.io.*;
class Student implements Serializable
{
	int id;
	String name;
	double marks;
	Student(int id,String name, double marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	void display(){
		System.out.println(id + "" + name + "" +marks);
	}
}
public class ReadStudentObject 
{
	public static void main(String args[])
	{
		
		try {
			FileInputStream file = new FileInputStream("Student.dat");
			ObjectInputStream in = new ObjectInputStream(file);
			Student s = (Student) in.readObject();
			s.display();
			System.out.println(s);
			in.close();
			file.close();
			
			}
		catch(IOException | ClassNotFoundException e){
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
}