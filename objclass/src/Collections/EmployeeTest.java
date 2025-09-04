package Collections;
import java.util.*;
public class EmployeeTest {
 public static void main(String[] args) {
	EmployeeMgt em = new EmployeeMgt();
	
	ArrayList<Employee> al = em.createEmployee();
	em.displayEmp(al);
	System.out.println("after updating your salary is : ");
	em.updateEmp(al);
	em.displayEmp(al);
	em.deleteEmp(al);
	System.out.println("after delting the list of employee is : ");
	em.displayEmp(al);
	System.out.println("sorting of id are: ");
	em.sortByname(al);
	



}
}
