package Collections;

import java.util.*;

public class EmployeeMgt {
   Scanner sc = new Scanner(System.in);
	public ArrayList<Employee> createEmployee() {
		Employee e = new Employee(6, "raghu", 55555);
		Employee e1 = new Employee(5, "ak", 25000);
		Employee e2 = new Employee(8, "raj", 57888);
		ArrayList<Employee> al = new ArrayList<>(Arrays.asList(e, e1, e2));
//		al.add(e);
//		al.add(e1);
//		al.add(e2);
//		al.addAll(Arrays.asList(e,e1,e2));
		return al;
	}

	public void displayEmp(ArrayList<Employee> al) {
		for (Employee e : al) {
			e.disEmp();
		}

	}

	public void updateEmp(ArrayList<Employee> al) {
		System.out.println("enter is u wanna update ");
		int n = sc.nextInt();

		for(Employee e:al) {
			if(n == e.id) {
				System.out.println("enetr salary how much u want to add");
				int sal = sc.nextInt();
				e.sal = e.sal + sal;
			}
		}	
	}

	public void deleteEmp(ArrayList<Employee> al) {
		int pos=0 ;
		System.out.println("enter id which u wnat to delete");
		int n = sc.nextInt();
		for(Employee e:al) {
			if(n == e.id) {
				pos = al.indexOf(e);
			}else {
				System.out.println("please enter valid id");
			}
		}
		al.remove(pos);
	}
	
	public void sortById(ArrayList<Employee> al) {
//		Collections.sort(al,new Comparator<Employee>() {
//			@Override
//			public int compare(Employee e1,Employee e2) {
//				if(e1.id<e2.id) {
//					return 1;
//				}else if(e1.id>e2.id) {
//					return -1;
//				}
//				else {
//					return 0;
//				}
//			}
//		});
		Collections.sort(al,new Comparator<Employee>() {
			public int compare(Employee e1,Employee e2) {
				return Integer.compare(e1.id,e2.id);
			}
		});
	}
	
	public void sortByname(ArrayList<Employee> al) {
		Collections.sort(al,new Comparator<Employee>() {
			public int compare(Employee e1,Employee e2) {
				return e1.name.compareTo(e2.name);
			}
		});
	}
	
	public void sortBySalary(ArrayList<Employee> al) {
	    Collections.sort(al, new Comparator<Employee>() {
	        @Override
	        public int compare(Employee e1, Employee e2) {
	            return Double.compare(e1.sal, e2.sal); // ✅ ascending salary
	        }
	    });
	}

	

}
