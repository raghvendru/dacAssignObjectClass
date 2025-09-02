package Assign3MultiLevel;

import java.util.*;

class Vehicle {
	int id;
	String brand;
	int rentPerDay;

	public Vehicle(int i, String b, int r) {
		this.id = i;
		this.brand = b;
		this.rentPerDay = r;
	}
}

class Car extends Vehicle {
	public Car(int i, String b, int r) {
		super(i, b, r);
	}

	public int calRent(int days) {
		int ans = days * rentPerDay;
		return ans;
	}
}

class Bike extends Vehicle {
	public Bike(int i, String b, int r) {
		super(i, b, r);
	}

	public int calRent(int days) {
		int ans = days * rentPerDay;
		return ans;
	}
}

public class VehicleRentalSys {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car[] c = new Car[1];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Car(sc.nextInt(), sc.next(), sc.nextInt());
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println("enter days you wanna rent a car");
			int n = sc.nextInt();
			System.out.println("you have to pay: ");
			System.out.println(c[i].calRent(n));
		}

		Bike[] b = new Bike[1];
		for (int i = 0; i < b.length; i++) {
			b[i] = new Bike(sc.nextInt(), sc.next(), sc.nextInt());
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("enter days you wanna rent a Bike");
			int n = sc.nextInt();
			System.out.println("you have to pay: ");
			System.out.println(b[i].calRent(n));
		}
	}
}
