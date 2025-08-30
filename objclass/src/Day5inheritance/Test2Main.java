package Day5inheritance;

class Vehicle1 {
	public void start() {
		System.out.println("Vehicle starting...");
	}
}

class Car1 extends Vehicle1 {
	public void start() {
		System.out.println("Car starting...");
	}

	public void carOnlyFeature() {
		System.out.println("Car has AC");
	}
}

public class Test2Main {
	public static void main(String[] args) {
		Vehicle1 v = new Car1();
		v.start(); // ✅ Car starting...
		// v.carOnlyFeature(); // ❌ Compile error: Vehicle type doesn’t know this

		Car1 c = new Car1();
		c.start(); // ✅ Car starting...
		c.carOnlyFeature(); // ✅ Car has AC
	}

}
