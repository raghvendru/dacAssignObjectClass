package Assignment2;

public class EmployeePayRollSystem {
	int empid;
	String name;
	double basicSalary;

	public EmployeePayRollSystem(int empid, String name, double basicSalary) {
		this.empid = empid;
		this.name = name;
		this.basicSalary = basicSalary;
		//getGrossSalary();
		display();
	}

	public double getGrossSalary() {
		double hra = 0.2 * basicSalary;
		double da = 0.1 * basicSalary;
		return basicSalary + hra + da;
	}

	public void display() {
		System.out.println("Employee id "+empid);
		System.out.println("Name "+name);
		System.out.println("Basic salary "+basicSalary);
		System.out.println("gross Salary: "+getGrossSalary());
	}
	
}
