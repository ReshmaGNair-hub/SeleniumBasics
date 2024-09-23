package collection;



	import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
	import java.util.List;
import java.util.Set;

	public interface InterfaceSample2 {
		public static void main(String[] args)
		{
			Set a = new HashSet();
			a.add(9);
			a.add(0.5f);
			a.add('h');
			a.add("hi");
			System.out.println(a);
			
			Set b = new HashSet();
			b.add("hello");
			b.add("go");
			System.out.println(b);
			b.addAll(a);
			System.out.println(b);
			
			Set<String> c = new HashSet();
			c.add("i");
			c.add("love");
			c.add("myself");
			c.remove(0);
			System.out.println(c);
			c.removeAll(c);
			System.out.println(c);
			System.out.println(c.size());
			//System.out.println(b.get(3));
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





