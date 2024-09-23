package collection;

import java.util.ArrayList;
import java.util.Iterator;



public class CollectionSample1 {

	public static void main(String[] args) {
		
		
		ArrayList a = new ArrayList();//non generic
		a.add("Hello");
		a.add(0.23f);
		a.add(20);
		a.add('d');
		System.out.println(a);
		// TODO Auto-generated method stub
		
		ArrayList<String> b = new ArrayList();//generic array list
		b.add("Hello");
		b.add("how");
		b.add("are");
		b.add("you");
		System.out.println(b);
		b.remove(0);
		System.out.println(b);
		
		
		ArrayList<String> c = new ArrayList();
		c.add("cat");
		c.add("kitten");
		c.addAll(b);
		System.out.println(c);
		c.removeAll(c);
		System.out.println(c);
		System.out.println(b.get(2));
		System.out.println(b.size());
		boolean s= b.contains("how");
		System.out.println(s);
		boolean f = b.contains("me");
		System.out.println(f);
		
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(a);
		

	}

}
