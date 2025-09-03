package Assign4;
//### *Problem 4: Appliance Power Consumption*

//
//* Create a superclass *Appliance* with instance variables name and power (in watts).
//* Provide a constructor to initialize these values.
//* Define a method showConsumption(int hours) that displays a generic message.
//* Create three subclasses:
//
//  1. *Fan* → override showConsumption() to calculate total watt-hours used.
//  2. *AirConditioner* → override showConsumption() to calculate watt-hours used.
//  3. *Refrigerator* → override showConsumption() to calculate watt-hours used.
//* Create objects of each subclass and display consumption for given hours.

class Appliance {
	String name;
	int power;

	public Appliance(String name, int power) {
		this.name = name;
		this.power = power;
	}

	public void showConsumption(int hours) {
		System.out.println("Generic appliance consumption" + power);
	}
}

class Fan extends Appliance {
	public Fan(String name, int power) {
		super(name, power);
	}

	@Override
	public void showConsumption(int hours) {
		int consumption = power * hours;
		System.out.println(name + " consumed: " + consumption + " Wh");
	}
}

class AirConditioner extends Appliance {
	public AirConditioner(String name, int power) {
		super(name, power);
	}

	@Override
	public void showConsumption(int hours) {
		int consumption = power * hours;
		System.out.println(name + " consumed: " + consumption + " Wh");
	}
}

class Refrigerator extends Appliance {
	public Refrigerator(String name, int power) {
		super(name, power);
	}

	@Override
	public void showConsumption(int hours) {
		int consumption = power * hours;
		System.out.println(name + " consumed: " + consumption + " Wh");
	}
}

public class AppliencesPsavingSys {
	public static void main(String[] args) {
		Fan fan = new Fan("Ceiling Fan", 75);
		AirConditioner ac = new AirConditioner("Split AC", 1500);
		Refrigerator fridge = new Refrigerator("Samsung Fridge", 200);

		fan.showConsumption(5);
		ac.showConsumption(3);
		fridge.showConsumption(24);
	}

}
