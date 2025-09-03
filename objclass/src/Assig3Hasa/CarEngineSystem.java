package Assig3Hasa;
import java.util.*;
class Engine{
	String eNo;
	int hPower;
	String fuelType;
	public Engine(String e,String f,int h) {
		this.eNo = e;
		this.fuelType = f;
		this.hPower = h;
	}
	
	public void startEngine() {
		System.out.println("enge n : " + eNo + " has Started");
	}
	public void stopEngine() {
		System.out.println("enge n : " + eNo + " has stopped ");
	}
	
	
}

class Car {
	String Carmodel;
	String brand;
	float price;
	Engine e;
	
	public Car(String c,String b,float p,Engine e) {
		this.Carmodel = c;
		this.brand = b;
		this.price = p;
		this.e = e;
	}
	
	public void startCar() {
		e.startEngine();
		System.out.println("car model : " + Carmodel + " has Started");
	}
	public void stopCar() {
		e.stopEngine();
		System.out.println("car model : " + Carmodel + " has stopped ");
	}
	
	public void display() {
	        System.out.println("Car Model: " + Carmodel);
	        System.out.println("Brand: " + brand);
	        System.out.println("Price: " + price);
	        System.out.println(e.eNo + e.hPower + e.fuelType);
	      
	}
}
public class CarEngineSystem {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Car[] c = new Car[1];
	//Engine e = new Engine[1];
	
	for(int i=0;i<c.length;i++) {
		System.out.println("enter engiene details: ");
		String eNo = sc.next();
		String hp = sc.next();
		int f = sc.nextInt();
		
		System.out.println("enter Car details: ");
		String carM = sc.next();
		String b = sc.next();
		float price = sc.nextFloat();
		Engine e = new Engine(eNo,hp,f);
		c[i] = new Car(carM,b,price,e);
	}
	
	for(int i = 0;i<c.length;i++) {
		c[i].startCar();
		c[i].stopCar();
		c[i].display();
	}
}
}
