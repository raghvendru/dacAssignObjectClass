package Assign4;
//### *Problem 2: Employee Salary System*
//
//* Create a superclass *Employee* with instance variables name and basicSalary.
//* Provide a constructor to initialize employee details.
//* Define a method calculateSalary() to display the basic salary.
//* Create two subclasses:
//
//  1. *Manager* → override calculateSalary() to include allowance (20% of basic).
//  2. *SoftwareEngineer* → override calculateSalary() to include bonus (15% of basic).
//* Create objects of both subclasses and calculate salary using overridden methods.
class Employee{
	String name;
	float bSalary;
	public Employee(String name, float bSalary) {
		super();
		this.name = name;
		this.bSalary = bSalary;
	}
	public void calSalary() {
		System.out.println("basic salary of a person is : " + bSalary);
	}
}
class Manager extends Employee{

	public Manager(String name, float bSalary) {
		super(name, bSalary);
	}
	public void calSalary() {
		System.out.println("basic salary of a person is : " + (bSalary+(bSalary*0.7)));
	}
	
}
class SoftwareEngineer extends Employee{

	public SoftwareEngineer(String name, float bSalary) {
		super(name, bSalary);
	}
	public void calSalary() {
		System.out.println("basic salary of a person is : " + (bSalary+(bSalary*0.5)));
	}
	
}
public class EmployeeSalSystem {
public static void main(String[] args) {
	Employee e;
	e = new Manager("nsnathan",25000);
	e.calSalary();
	e = new SoftwareEngineer("raghu",25000);
	e.calSalary();

}
}
