package inheritance;

public class SuperChild1 extends SuperParent1{
	
	public void display2()
	{
		
		System.out.println("Super Child");
		System.out.println(super.a);
		System.out.println(super.b);
		super.display(2, 3);
		
	}
	public SuperChild1()
	{
		super();
		
	}
	
	public static void main(String args[])
	{
		SuperChild1 obj = new SuperChild1();
		obj.display2();
	}
}
