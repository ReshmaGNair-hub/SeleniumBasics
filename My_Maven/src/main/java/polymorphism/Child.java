package polymorphism;

public class Child extends Parent {
	@Override
	public void display()
	{
		System.out.println("Child class");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.display();
		
	}

}
