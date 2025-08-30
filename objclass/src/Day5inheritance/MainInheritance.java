package Day5inheritance;

class Vehicle {
	public String brand = "FORD";
	static int a = 10;
	private int b = 100;//not accessible in child
    public String model_no  = "101";

	public void start() {
		System.out.println("Car is starting in PARENT");
	}
	public void brandName() {
		System.out.println(brand);
		System.out.println(a+"in parent");
	}
	public void run() {
		System.out.println("in parent run method");
	}

}

class Car extends Vehicle {
	
    public String model_no  = "102";

	public void brandName() {
		System.out.println(brand);
		System.out.println(a+"in child");
	}
	public void start() {
		System.out.println("Car is starting in CHILD");
	}
	

}

public class MainInheritance {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.brandName();
		System.out.println(c.model_no);;
		c.run();
		
		Vehicle v =new Car();
		v.start();
		v.brandName();
		System.out.println(v.model_no);
		v.run();

	}

}
