package collection1;

import java.util.ArrayList;
import java.util.List;

public class collection {

	public static void main(String[] args) {
		
		
		List<String> a = new ArrayList();
		a.add("Hi");
		a.add("0.6f");
		a.add("9");
		a.get(0);
		//a.removeAll(a);
		System.out.println(a);
		a.get(0);
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.contains("c"));
		
		
		List<String> b =  new ArrayList();
		b.add("go");
		b.addAll(a);
		System.out.println(b);
		
		
		
		// TODO Auto-generated method stub

	}

}
