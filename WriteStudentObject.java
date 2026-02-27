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
public class WriteStudentObject 
{
	public static void main(String args[])
	{
		Student s1 = new Student(101,"Krishna Rao",88.5);
		try {
			FileOutputStream file = new FileOutputStream("Student.dat");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(s1);
			out.close();
			file.close();
			System.out.println("Student object Written successfully");
		}
		catch(IOException e){
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
}