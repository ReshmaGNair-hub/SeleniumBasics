package inheritancePractice;

public class SuperChild extends SuperParent {
	
	
	public void display()
	{
		System.out.println(this.a);
	}
	
	public SuperChild()
	{
	super(2,3);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild obj = new SuperChild();
		obj.display();
		
				
		

	}

}
