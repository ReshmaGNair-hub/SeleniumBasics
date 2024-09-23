package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectySample2 {
	public static void main(String[] args)
	{
	
	LinkedList a = new LinkedList();
	a.add(0.01f);
	a.add("hello");
	a.add(5);
	a.add('H');
	System.out.println(a);
	
	
	
	LinkedList<String> b = new LinkedList();
	b.add("hi");
	b.add("how");
	b.add("are");
	b.add("you");
	System.out.println(b);
	;
	System.out.println(b.remove(3));
	//System.out.println(b.removeAll(b));
	
	LinkedList <String> c = new LinkedList();
	c.add("Its");
	c.add("okie");
	System.out.println(c);
	c.addAll(b);
	System.out.println(c);
	//c.removeAll(c);
	System.out.println(c.removeAll(c));
	System.out.println(b.size());
	System.out.println(b.get(1));
	boolean s = b.contains("hi");
	System.out.println(s);
	boolean f = b.contains("no");
	System.out.println(f);
	Iterator o = a. iterator();
	while(o.hasNext())
	{
		System.out.println(o.next());
		
	}
	o.remove();
	System.out.println(a);
	
	
}
	

}
