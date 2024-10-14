package stringMutable;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("Hello");
		System.out.println(a.append("World"));
		System.out.println(a.insert(0, "I"));
		System.out.println(a.replace(0, 2, "Go"));
		System.out.println(a.reverse());
		System.out.println(a.delete(2, 4));
		
		
		// TODO Auto-generated method stub

	}

}
