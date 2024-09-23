package aggregate;

public class ClassAggregate2 {
	public void display()
	{
		int a = 10;
		int b =20;
		System.out.println("The sub is ="+( a-b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassAggregate1 obj =new ClassAggregate1();//aggregate
		obj.print();
		ClassAggregate2 obj1 =new ClassAggregate2();
		
		obj1.display();
	}

}
   