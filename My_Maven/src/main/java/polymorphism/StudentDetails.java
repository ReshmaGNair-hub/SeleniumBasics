package polymorphism;

public class StudentDetails extends CollegeDetails {
	public void display(String name , int age, char sex , String section)
	{
		super .display("HolyAngels",1920,'f',"Botany");
		
		System.out.println("Student name is " + name + ", Age is= " + age + ", Sex is= " + sex + ", Section = " + section);
	}
	public static void main(String args[])
	{
		StudentDetails obj = new StudentDetails();
		obj.display("Reshma",20,'F',"Zoology");
	}
}