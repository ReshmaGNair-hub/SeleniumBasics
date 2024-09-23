package absraction;

public abstract  class Abstarct5 {
	public abstract void display1();
	static int age =20;
	public static void display2()
	{
		System.out.println(age);
		
	}
	public Abstarct5()
	{
		System.out.println("constructor in abstract");
	}
	String colour= "red";
	public void display3()
	{
		System.out.println(colour);
	}

}
