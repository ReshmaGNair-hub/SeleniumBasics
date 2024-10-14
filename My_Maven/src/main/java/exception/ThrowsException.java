package exception;

public class ThrowsException {
	
	
	public  void age(int a) throws ArithException
	{
		if (a<18)
		{
			throw new ArithException("not elligible for voting");
		}
		else
		{
			System.out.println("Elligible for exception");
		}
	}

	public static void main(String[] args) throws ArithException  {
		ThrowsException obj = new ThrowsException();
		obj.age(7);
		
		// TODO Auto-generated method stub

	}

}
