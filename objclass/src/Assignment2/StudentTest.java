package Assignment2;

public class StudentTest {
public static void main(String[] args) {
	Student[] stu = new Student[2];
	Student[] students = {new Student(123,"raghu",new int[] {40,45,80}),
			new Student(123,"ram",new int[] {0,5,0})
			
	};
	System.out.println("Your average mark is :");
	for(Student s:students) {
		double ans = s.averageMarks();
		System.out.println(ans);
	}
	
	System.out.println("and your garde is: ");
	for(Student s:students) {
		char ans = s.getGrade();
		System.out.println(ans);
	}
}
}
