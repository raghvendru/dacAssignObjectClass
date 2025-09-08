package Extras;

import java.util.*;

public class Empmgt {
	Scanner sc = new Scanner(System.in);

	public ArrayList<Employee> createemp() {
		Employee e = new Employee(1,"raghu",55000);
		Employee e1 = new Employee(3,"ak",35000);
		Employee e2 = new Employee(2,"nihal",45000);
		Employee e3 = new Employee(4,"advik",65000);
		ArrayList<Employee> al = new ArrayList<>(Arrays.asList(e,e1,e2,e3));
		return al;	
	}

	public void disEmp(ArrayList<Employee> al) {
		for(Employee e:al) {
			e.disEmp();
		}	
	}

	public void update(ArrayList<Employee> al) {
		System.out.println("enter id which u wanna update ");
		int n = sc.nextInt();
		for(int i=0;i<al.size();i++) {
			if(n == al.get(i).id) {
				System.out.println("enter sal u wanna update ");
				int m = sc.nextInt();
				al.get(i).sal =al.get(i).sal+ m ;
			}
		}
	}

	public void deleteEMp(ArrayList<Employee> al) {
		System.out.println("enter id which u want to delete ");
		int n = sc.nextInt();
		int pos = -1;
		for (int i = 0; i < al.size(); i++) {
		    if (al.get(i).id == n) {
		        pos = i;
		        break;  
		    }
		}
		if (pos != -1) {
		    al.remove(pos);
		    System.out.println("Employee deleted successfully");
		} else {
		    System.out.println("Please enter valid id");
		}
	}

	public void SortById(ArrayList<Employee> al) {
		int n = al.size();
		for(int i = 0;i<al.size()-1;i++) {
			int mini = i;
			for(int j = i;j<al.size();j++) {
				if(al.get(j).id< al.get(mini).id) {
					mini = j;
				}
			}
			Employee temp = al.get(mini);
			al.set(mini,al.get(i));
			al.set(i,temp);
		}
		
	}
	
	public void sortByName(ArrayList<Employee> al) {
		Collections.sort(al,new Comparator<Employee>() {
			public int compare(Employee e1,Employee e2) {
				return e1.name.compareTo(e2.name);
			}
		});
	}

}
