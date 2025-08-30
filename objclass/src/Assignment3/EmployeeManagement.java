package Assignment3;
import java.util.*;
class Employee{
	String name;
	double salary;
	
	public void displayDetails() {
		System.out.println("employee name is : " + name +" salary is: " +salary);
	}
}
class Manager extends Employee{
	static int tSize=15;
	
	public Manager(String n,double s) {
		this.name = n;
		this.salary = s;
		//this.tSize = t;
	}
	
	public double getBonus() {
		double bonus = tSize*1000;
		return bonus;
	}
}
public class EmployeeManagement {
	public static void main(String[] args) {
		Manager[] m = new Manager[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<m.length;i++) {
			m[i] = new Manager(sc.next(),sc.nextDouble());
		}
		for(int i=0;i<m.length;i++) {
			m[i].displayDetails();
			System.out.println("bonus i am offering you is :"+m[i].getBonus());
		}

	}

}
