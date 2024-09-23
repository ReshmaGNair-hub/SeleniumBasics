package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface InterfaceSample1 {
	public static void main(String[] args)
	{
		List a = new ArrayList();
		a.add(9);
		a.add(0.5f);
		a.add('h');
		a.add("hi");
		System.out.println(a);
		
		List b = new ArrayList();
		b.add("hello");
		b.add("go");
		System.out.println(b);
		b.addAll(a);
		System.out.println(b);
		
		List<String> c = new ArrayList();
		c.add("i");
		c.add("love");
		c.add("myself");
		c.remove(0);
		System.out.println(c);
		c.removeAll(c);
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(b.get(3));
		boolean s = a.contains("go");
		System.out.println(s);
		boolean f = a.contains('h');
		System.out.println(f);
		Iterator o = a.iterator();
		while(o.hasNext())
		{
			System.out.println(o.next());
		}
		o.remove();
		System.out.println(a);
	}
		
		
		
		
		
	}


