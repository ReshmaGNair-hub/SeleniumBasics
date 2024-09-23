package accessModifier1;

import accessModifier.Class1;



public class Class3 {
	public void display2()
	{
		System.out.println("Method in outside the package");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj = new Class1();
		
		obj.display1();
		//obj.display2();
		//obj.display3();
		//obj.display4();
		Class3 obj1 = new Class3();
		obj1.display2();
		
		

	}

}
