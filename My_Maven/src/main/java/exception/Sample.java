package exception;

public class Sample {
	public void test(int age) throws LicenseException//declare
	{
		
			if(age<18)
			{
				
			
			throw new LicenseException("not elligible");//throwan exception
			//System.out.println("Not elligible for voting");
		}
			else
			{
				System.out.println("Elligible for Voting");
			}
		}
	

	public static void main(String[] args) throws LicenseException {
		Sample obj = new Sample();
		obj.test(5);
		
		// TODO Auto-generated method stub

	}

}
