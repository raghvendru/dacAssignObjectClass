package Assign3MultiLevel;

import java.util.*;

class Person {
	String name;
	int age;
	int id;

	public Person(String n, int a, int i) {
		this.name = n;
		this.age = a;
		this.id = i;
	}

}

class Student extends Person {
	public Student(String n, int a, int i) {
		super(n, a, i);
	}

	public char calGrade(int marks) {

		if (marks >= 90) {
			return 'A';
		} else if (marks < 90 && marks >= 70) {
			return 'B';
		} else if (marks < 70 && marks >= 50) {
			return 'C';
		} else if (marks < 50 && marks >= 35) {
			return 'D';
		} else {
			return 'F';
		}

	}
}

class Teacher extends Person {
	public Teacher(String n, int a, int i) {
		super(n, a, i);
	}

	public int calSal(int hoursWorked, int ratePerHour) {
		return hoursWorked * ratePerHour;
	}
}

public class EducationalInstitute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[1];

		for (int i = 0; i < s.length; i++) {
			s[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		}

		for (int i = 0; i < s.length; i++) {
			System.out.println("enter mark of student");
			int n = sc.nextInt();
			System.out.println(s[i].id + s[i].name + s[i].age + s[i].calGrade(n));
		}

		Teacher[] s1 = new Teacher[1];

		for (int i = 0; i < s.length; i++) {
			s1[i] = new Teacher(sc.next(), sc.nextInt(), sc.nextInt());
		}

		for (int i = 0; i < s1.length; i++) {
			System.out.println("enter hoursWorked of teacher");
			int n = sc.nextInt();
			System.out.println("enter rateper hour of teacher");
			int n1 = sc.nextInt();
			System.out.println(s1[i].id + s1[i].name + s1[i].age + s1[i].calSal(n,n1));
		}
	}
}
