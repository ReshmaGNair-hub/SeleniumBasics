package inheritance;

public class Child extends Parent {
	public void mul()
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		
		System.out.println(obj.b);
		System.out.println(obj.a);
		
		obj.add();
		obj.mul();
		obj.sub();

	}

}
