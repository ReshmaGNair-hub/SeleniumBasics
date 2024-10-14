package exception;

public class AllExceptions {
	
	public void print()
	{
		
	
	  String g ="";
	  	System.out.println(g.length());
	}
	
	public  void dis()
	{
		int a=20;
		int b =a/0;
		System.out.println(b);
		
		
		
	}

	public static void main(String[] args) {
		AllExceptions obj = new AllExceptions();
				
		
		obj.print();
		obj.dis();
		// TODO Auto-generated method stub

	}

}
