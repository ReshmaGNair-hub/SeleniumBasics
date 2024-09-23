package inheritance;

public class SuperChild  extends SuperParent{
	public void display1()
	{
		System.out.println("Super Child");
		super.display();
		System.out.println(super.a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperChild obj = new SuperChild();
		obj.display1();
				
	}

}
