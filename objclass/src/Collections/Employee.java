package Collections;

public class Employee {
	int id;
	String name;
	float sal;
	
	public Employee(int i,String n,float f) {
		this.id = i;
		this.name = n;
		this.sal = f;
	}
	
	public void disEmp() {
		System.out.println("employee id : "+ id + " name is : " + name + " salary is "+ sal);
	}
}
