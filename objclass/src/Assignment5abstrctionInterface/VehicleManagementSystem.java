package Assignment5abstrctionInterface;
//Abstract Class – Problem Statements
//Problem 1: Vehicle Rental System
//•	Create an abstract class Vehicle with instance variables vehicleNumber and rentalPrice.
//•	Add an abstract method calculateRent(int days).
//•	Subclasses Car and Bike should have constructors to initialize instance variables.
//•	Implement calculateRent() differently for Car and Bike (e.g., Car has higher per-day rent, Bike has lower).
//•	Write a test class to create objects of Car and Bike and calculate total rent.
abstract class Vehicle{
	int vNo;
	double rentPrice;
	public Vehicle(int n,double p) {
		this.vNo = n;
		this.rentPrice = p;
	}
	abstract double calRent(int days) ;
}
class Car extends Vehicle{
	public Car(int n,double p) {
		super(n,p);
	}
	
	public double calRent(int days) {
		return days*rentPrice*2.5;
	}
}
class Bike extends Vehicle{
	public Bike(int n,double p) {
		super(n,p);
	}
	
	public double calRent(int days) {
		return days*rentPrice;
	}
}
public class VehicleManagementSystem {
public static void main(String[] args) {
	Vehicle v;
	v = new Car(123,5589);
	System.out.println(	v.calRent(25));
	v = new Bike(456,5589);
	System.out.println(	v.calRent(25));
}
}
