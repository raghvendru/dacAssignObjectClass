package Assign3MultiLevel;

import java.util.*;

class HospitalMember {
    int memberId;
    String name;
    String department;

    public HospitalMember(int id, String n, String d) {
        this.memberId = id;
        this.name = n;
        this.department = d;
    }
}

class Doctor extends HospitalMember {
    public Doctor(int id, String n, String d) {
        super(id, n, d);
    }

    public double calculateConsultationFee(int patients, double feePerPatient) {
        return patients * feePerPatient;
    }
}

class Nurse extends HospitalMember {
    public Nurse(int id, String n, String d) {
        super(id, n, d);
    }

    public int calculateDutyHours(int shifts, int hoursPerShift) {
        return shifts * hoursPerShift;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Doctor d = new Doctor(sc.nextInt(), sc.next(), sc.next());
        System.out.println("Consultation Fee: " + d.calculateConsultationFee(10, 500));

        Nurse n = new Nurse(sc.nextInt(), sc.next(), sc.next());
        System.out.println("Duty Hours: " + n.calculateDutyHours(5, 8));
    }
}
