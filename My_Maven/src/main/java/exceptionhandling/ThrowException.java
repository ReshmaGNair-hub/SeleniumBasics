package exceptionhandling;

public class ThrowException {
	public static void age(int a)
	{
		if(a<18)
		{
			
		
		throw new ArithmeticException("not elligible");//throwing to constructor of arithmeticexception
		//System.out.println("Not elligible for voting");
	}
		else
		{
			System.out.println("Elligible for Voting");
		}
	}
	

	public static void main(String[] args) {
		ThrowException obj = new ThrowException();
		obj.age(8);
		// TODO Auto-generated method stub

	}

}
