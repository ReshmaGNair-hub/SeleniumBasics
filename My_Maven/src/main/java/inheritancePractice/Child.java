package inheritancePractice;

public class Child extends Parent {
	public void print()
	{
		this.display();
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		//obj.display();
		obj.print();

	
		
		
		

	}

}
