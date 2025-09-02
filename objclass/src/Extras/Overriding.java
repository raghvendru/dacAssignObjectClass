package Extras;

import java.util.Scanner;

class Bank {

	void payment(float amt) {
		System.out.println("paid " + amt);
	}

}

class CreditCard extends Bank {

	void payment(float amt) {
		System.out.println("paid " + amt + " using credit card");

	}

}

class UPI extends Bank {

	void payment(float amt) {
		System.out.println("paid " + amt + " using upi");

	}

}

class Debit extends Bank {

	void payment(float amt) {
		System.out.println("paid " + amt + " using Debit");

	}

}

public class Overriding {
	public static void main(String[] args) {

		Bank b;

		Scanner s = new Scanner(System.in);
		System.out.println("enter the mode of payment and amt");
		String cname = s.next();
		float amt = s.nextFloat();
		if (cname.equals("CreditCard")) {
			b = new CreditCard();
		} else if (cname.equals("Debit")) {
			b = new Debit();
		} else if (cname.equals("UPI"))

			b = new UPI();

		else {
			b = null;
		}

		b.payment(amt);

//		b = new CreditCard();
//		b.payment(3000);
//		b = new UPI();
//		b.payment(2000);
//	    b = new Debit();
//	    b.payment(4000);

	}
}
