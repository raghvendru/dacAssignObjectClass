package Extras;

public class Employee {
	long id;
	String name;
	double sal;
	public Employee(long i,String n,double sal) {
		this.id = i;
		this.name = n;
		this.sal = sal;
	}
	
	public void disEmp() {
		System.out.println("emp id is :==>" +  id + " emp name is :==> " + name + " emp salary is :==> " + sal);
	}

}
