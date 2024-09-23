package absraction;

public class SampleClass extends AbstractClass{
	public void print()
	{
		System.out.println("Abstract Method");
	}
	public void show()
	{
		System.out.println("Method in sample Class");
	}
	public static void main(String[] args) {
		
		
		SampleClass obj = new SampleClass();
		obj.print();
		obj.show();
		obj.display();
		

	}

}
