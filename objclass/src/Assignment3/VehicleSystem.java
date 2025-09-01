package Assignment3;
import java.util.*;

class Vehicle {
	public String brand;
	public int fuel;

	public int refuel(int lit) {
		fuel += lit;
		return fuel;
	}
}

class Car extends Vehicle {
	public double mileage;

	public Car(String b, int f, double m) {
		this.brand = b;
		this.fuel = f;
		this.mileage = m;
	}

	public double calculateDist() {
		double dist = mileage * fuel;
		return dist;
	}
}

public class VehicleSystem {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Car[] c = new Car[2];
		for(int i=0;i<c.length;i++) {
			c[i] = new Car(sc.next(),sc.nextInt(),sc.nextDouble());
		}
		for(int i=0;i<c.length;i++) {
			System.out.println("enter how many litres you wanna fuel: ");
			int n = sc.nextInt();
			System.out.println("after refueling,you have prently :");
			System.out.println(c[i].refuel(n));
			System.out.println("Your car can travel upto :"+c[i].calculateDist()+" based on available fuel ");
		}
		

	}

}
