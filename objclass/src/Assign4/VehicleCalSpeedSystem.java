package Assign4;
//### *Problem 3: Vehicle Speed Calculation*
//
//* Create a superclass *Vehicle* with instance variables brand and maxSpeed.
//* Provide a constructor to initialize these values.
//* Define a method showTopSpeed() that displays a generic message.
//* Create three subclasses:
//
//  1. *Car* → override showTopSpeed() to display car’s max speed.
//  2. *Bike* → override showTopSpeed() to display bike’s max speed.
//  3. *Truck* → override showTopSpeed() to display truck’s max speed.
//* Create objects of all three subclasses and display their speeds.
class Vehicle{
	String brand;
	int maxSpeed;
	public Vehicle(String brand, int maxSpeed) {
		//super();
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	public void showtopSpeed() {
		System.out.println("top speed of vehichle :"+maxSpeed);
	}
}
class Car extends Vehicle{
	public Car(String b,int m) {
		super(b,m);
	}
	public void showtopSpeed() {
		System.out.println("top speed of car :"+maxSpeed);
	}
}
class Bike extends Vehicle{
	public Bike(String b,int m) {
		super(b,m);
	}
	public void showtopSpeed() {
		System.out.println("top speed of bike :"+maxSpeed);
	}
}
class Truck extends Vehicle{
	public Truck(String b,int m) {
		super(b,m);
	}
	public void showtopSpeed() {
		System.out.println("top speed of truck :"+maxSpeed);
	}
}
public class VehicleCalSpeedSystem {
public static void main(String[] args) {
	Vehicle v;
	v = new Car("benz",25);
	v.showtopSpeed();
	v = new Bike("ninja",65);
	v.showtopSpeed();
	v = new Truck("mahindra",35);
	v.showtopSpeed();
}
}
