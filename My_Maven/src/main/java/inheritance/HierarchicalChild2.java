package inheritance;

public class HierarchicalChild2 extends HierarchicalParent {
	public void sub()
	{
		System.out.println("SUB="+(a-b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchicalChild2 obj = new HierarchicalChild2 ();
		obj.sub();
		obj.sum();
		System.out.println(obj.b);
		System.out.println(obj.a);
	}

}

