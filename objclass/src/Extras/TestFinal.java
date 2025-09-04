package Extras;

final class vehicle
{
	
	
	 final void start()
{
	System.out.println("vehicle is starting");
}
	
}

class Car extends vehicle
{
	void start()
	{
		System.out.println("car is starting");
	}
	
	
}


public class TestFinal
{
	public static void main(String[] args) 
	{
	
		Car c = new Car();
		c.start();
	}

}

