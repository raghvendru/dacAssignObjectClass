package Assignment3;
import java.util.*;

class Student {
	public String name;
	public int marks;

	public void showDetails() {
		System.out.println("Student name is : " + name + " Student marks is: " + marks);
		;
	}

}

class GraduateStudent extends Student {
	public String Specialisation;

	public GraduateStudent(String n, int m, String s) {
		this.name = n;
		this.marks = m;
		this.Specialisation = s;
	}
	
	public void checkPass() {
		if(marks>=50) {
			System.out.println("congrats!!!!!!!!! you PASEED");
		}else {
			System.out.println("sorry!! you FAILED ,Beter luck next time");
		}
			
	}
}

public class StudentGradingSystem {
	public static void main(String[] args) {
		GraduateStudent[] g = new GraduateStudent[2];
		Scanner sc =  new Scanner(System.in);
		for(int i=0;i<g.length;i++) {
			g[i] = new GraduateStudent(sc.next(),sc.nextInt(),sc.next());
		}
		for(int i=0;i<g.length;i++) {
			g[i].showDetails();
            System.out.println("Specialisation: " + g[i].Specialisation);
			g[i].checkPass();
		}
	}

}
