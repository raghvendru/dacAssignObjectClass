package Extras;

public class TestObject 
{

	public static void main(String[] args) 
	{
	
		Employee e = new Employee(1001,"nsnathan",90000);
		e.displayEmployee();
		
		
		System.out.println(e.hashCode());
		
		System.out.println(e);
		
		
	}
}

