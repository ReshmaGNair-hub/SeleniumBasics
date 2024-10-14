package exceptionhandling;

public class ExceptionPractise {
	public void display()
	{
		try {
			int a =10;
			int b= a/0;
			System.out.println(b);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Hiii");
			
		
	}
		finally
		{
			System.out.println("Finally");
		}
	}


	public static void main(String[] args) {
		ExceptionPractise obj = new ExceptionPractise();
		obj.display();
		
		
		// TODO Auto-generated method stub

	}

}
