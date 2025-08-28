package objclassbasic;

public class StudentTest {
	public static void main(String[] args) {
		  Student s1 = new Student();
	        s1.rollNo = 101;
	        s1.name = "abc";
	        s1.cname = "dac College";
	        s1.subject = "Math";
	        s1.mark = 75;

	        Student s2 = new Student();
	        s2.rollNo = 102;
	        s2.name = "def";
	        s2.cname = "dachyd College";
	        s2.subject = "Physics";
	        s2.mark = 38;

	        Student s3 = new Student();
	        s3.rollNo = 103;
	        s3.name = "raghu";
	        s3.cname = "dacblr College";
	        s3.subject = "Chemistry";
	        s3.mark = 59;

	        Student s4 = new Student();
	        s4.rollNo = 104;
	        s4.name = "nthan";
	        s4.cname = "rv College";
	        s4.subject = "Biology";
	        s4.mark = 42;

	        Student s5 = new Student();
	        s5.rollNo = 105;
	        s5.name = "aman";
	        s5.cname = "sj College";
	        s5.subject = "History";
	        s5.mark = 29;

	        Student[] students = {s1, s2, s3, s4, s5};

	        for (int i = 0; i < students.length; i++) {
	            students[i].displayStudentInfor();
	            students[i].findResult();
	        }
	    }
	}

