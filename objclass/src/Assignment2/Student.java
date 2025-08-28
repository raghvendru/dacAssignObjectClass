package Assignment2;

public class Student {
	int rollNo;
	String name;
	int[] marks = new int[3];
	
	
	public Student(int rollNo,String name,int[] marks) {
		this.rollNo = rollNo;
		this.name=name;
		this.marks[0] = marks[0];
		this.marks[1] = marks[1];
		this.marks[2] = marks[2];
		
	}
	
	public double averageMarks() {
		double ans = (marks[0]+marks[1]+marks[2])/3.0;
		return ans;
	}
	
	public char getGrade() {
		double avg = averageMarks();
		if(avg>75) {
			return 'A';
		}else if(avg<75 && avg>40) {
			return 'B';
		}else {
			return 'F';
		}
	}

}
