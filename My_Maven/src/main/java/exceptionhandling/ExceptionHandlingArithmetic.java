package exceptionhandling;

public class ExceptionHandlingArithmetic {
	public void divide()
	{
	try
	{
		
	    int a=20; 
		int d = a/0;
		System.out.println(d);
		
	}
	catch(Exception e)
	{
		
		System.out.println("Exception Handled");
		System.out.println(e);
	}
	finally
	{
		System.out.println("Finally Block");//it execute eventhough exception is not handled
	}
	}
	



		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandlingArithmetic obj = new ExceptionHandlingArithmetic();
		obj.divide();
		System.out.println("Happy");

	}

}
