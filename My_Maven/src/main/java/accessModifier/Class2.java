package accessModifier;

public class Class2 {
	public void print()
	{
		System.out.println("Method of class2");
	}

	
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj = new Class1();
		obj.display1();
		//obj.display2();
		obj.display3();
		obj.display4();
		Class2 obj1 = new Class2();	
		obj1.print();

	}

}
