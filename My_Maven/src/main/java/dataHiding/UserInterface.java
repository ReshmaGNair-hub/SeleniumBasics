package dataHiding;

public class UserInterface  implements Interface3
{
	public void display()
	{
		System.out.println("interface");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserInterface obj = new UserInterface();
		obj.display();
		System.out.println(obj.age);
	}

}
