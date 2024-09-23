package accessModifier;



public class Class1 {
	public void display1() 
	{
	System.out.println("Public method")	;
	}
	private void display2()
	{
		System.out.println("Private method")	;	
	}
	protected void display3()
	{
		System.out.println("protected method");

	}
	 void display4()
	{
		System.out.println("default method");
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Class1 obj = new Class1();
		
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();

	}



	}


