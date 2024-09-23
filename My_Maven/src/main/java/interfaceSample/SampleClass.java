package interfaceSample;

public class SampleClass implements Interfacesample1 {
public void display()
{
	System.out.println("Abstract method1");
	
}
	public void add()
	{
		int c =a+b;
		System.out.println(c);
	}
	public void print()
	{
		System.out.println("method in class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass obj = new SampleClass();
		obj.display();
		obj.add();
		obj.print();
		System.out.println(obj.a);
		System.out.println(obj.b);
		Interfacesample1 obj1 = new SampleClass() ;//interface dont have constructor,so use the class name which implements interference.
		//obj1.print();
		obj1.add();
		obj1.display();
		System.out.println(obj1.a);
		System.out.println(obj1.b);

	}

}
