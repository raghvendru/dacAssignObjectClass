package objclassbasic;

import java.util.Scanner;

public class Student {
	int rollNo;
	String name;
	String cname;
	String subject;
	int mark;

	public void acceptdetails() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter roll num");
		this.rollNo = scanner.nextInt();
		System.out.println("Enter name");
		this.name = scanner.next();
		System.out.println("Enter class name");
		this.cname = scanner.next();
		System.out.println("Enter subject");
		this.subject = scanner.next();
		System.out.println("Enter mark");
		this.mark = scanner.nextInt();
	}
	
	public void displayStudentInfor() {
		System.out.println("roll no is:"+this.rollNo);
		System.out.println("name of student is: "+this.name);
		System.out.println("Class name is: "+this.cname);
		System.out.println("subject is :"+this.subject);
		System.out.println("mark is: "+this.mark);
	}
	
	public String findResult() {
		return (this.mark>=40) ? "PASS" : "FAIL";
	}

}
