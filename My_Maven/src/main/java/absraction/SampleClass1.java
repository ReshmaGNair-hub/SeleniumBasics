package absraction;

public class SampleClass1 extends AbstractClass1 
{
	public  void student()
	{
	
		System.out.println("reshma");
		
	}
	public void display2()
	
	{
		
		System.out.println("Reshma is a good girl");
		
	}
	public static void main(String args[])
	{
		SampleClass1 obj = new SampleClass1 ();
		obj.display2();
		obj.student();
		AbstractClass1.print();
		
	}
}
;