package dataHiding;

public class EncapsulationMain {
	
	private int a;
	private int b;
	
	public void setter(int a , int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void getter()
	{
		System.out.println(a);
		b= b*2;
		System.out.println(b);
	}

}
