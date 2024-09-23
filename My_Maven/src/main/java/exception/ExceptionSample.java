package exception;

public class ExceptionSample {
	
	public void display()
	{
		int a =10;
		int b= a/0;
		System.out.println(b);
	}

	public static void main(String[] args) {
		ExceptionSample obj = new ExceptionSample();
		System.out.println("End of statement");
		
		obj.display();
		System.out.println("End of statement");
		
		// TODO Auto-generated method stub

	}

}
