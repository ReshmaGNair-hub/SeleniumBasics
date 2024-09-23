package inheritance;

public class HierarchicalChild1 extends HierarchicalParent {
	public void mul()
	{
		System.out.println("Mul="+ (a*b));
	}
	public static void main(String args[])
	{
		HierarchicalChild1 obj = new HierarchicalChild1();
		obj.mul();
		obj.sum();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
	}
}
