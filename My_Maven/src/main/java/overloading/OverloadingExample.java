package overloading;
   

public class OverloadingExample {
	 int g =80;
	
	public OverloadingExample(int a , int b)
	{
		this.OverloadingExample();
	
		int c =a+b;
		System.out.println(c);
	}
	public OverloadingExample()
	{
		System.out.println("method overloading");
	}
	public static void OverloadingExample()
	{
		System.out.println("method");
	}
	
	public static void main(String[] args) {
		
		OverloadingExample obj = new OverloadingExample();
		//obj.OverloadingExample();
		OverloadingExample obj2 = new OverloadingExample(2,3);
		
		

	}

}
