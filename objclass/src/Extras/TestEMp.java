package Extras;
import java.util.*;
public class TestEMp {
public static void main(String[] args) {
	Empmgt em = new Empmgt();
	ArrayList<Employee> al = em.createemp();
	em.disEmp(al);
	em.update(al);
	System.out.println("after updating the details of employee are: ");
	em.disEmp(al);
	em.deleteEMp(al);
	System.out.println("after deleting the  employee ,new list of employee are: ");
	em.disEmp(al);
	
	em.SortById(al);
	
	System.out.println("after sorting the employee by id looks like : ");
	em.disEmp(al);

}
}
