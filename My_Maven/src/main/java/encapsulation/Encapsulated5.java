package encapsulation;

public class Encapsulated5 {
	private String  date ;
	private  int number;
	
	public void setter(String date , int number )
	
	{
		this.date=date;
		this.number=number;
		
		
	}
	public void getter()
	{
	System.out.println(date);
	 number=number*2;
	 System.out.println(number);
	}
	

}
