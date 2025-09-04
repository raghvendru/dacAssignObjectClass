package Extras;

interface ConnectDb
{

	public abstract void connect();
	
}

class Oracle implements ConnectDb
{
	
	public void connect()
	{
		System.out.println("connecting java with Oracle");
	}
	
}

class Mysql implements ConnectDb
{
	
	public void connect()
	{
		System.out.println("connecting java with Mysql");
	}
	
}


public class TestInterface
{

	public static void main(String[] args) 
	{
		Mysql m = new Mysql();
		m.connect();
		
	}
	
}
