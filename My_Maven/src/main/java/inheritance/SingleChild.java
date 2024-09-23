package inheritance;

public class SingleChild extends SingleParent {
	
public void print()
{
	System.out.println("child class");
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleChild obj = new SingleChild();
		obj.print();
		obj.display();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
	

	}
}
