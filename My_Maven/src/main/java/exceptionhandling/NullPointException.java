package exceptionhandling;

public class NullPointException {
	public void nullpoint()
	{
	try 
	{
	String a =null;
	System.out.println(a.length());
	}
	catch(Exception e)
	{
		System.out.println("Nullpoint Exception handled");
		System.out.println(e);
	}
}
	/*finally
	{
		System.out.println("Finally block");
	}
	}*/

	public static void main(String[] args) {
		NullPointException obj = new NullPointException();
		obj.nullpoint();
		System.out.println("I love coding");
		
		// TODO Auto-generated method stub

	}

}
