package Assign3MultiLevel;

import java.util.*;

class BankAccount {
	int accountNumber;
	String holderName;
	double balance;

	public BankAccount(int accNo, String name, double bal) {
		this.accountNumber = accNo;
		this.holderName = name;
		this.balance = bal;
	}

	public void deposit(double amt) {
		balance += amt;
	}

	public void withdraw(double amt) {
		if (amt <= balance) {
			balance -= amt;
		} else {
			System.out.println("Insufficient balance!");
		}
	}
}

class SavingsAccount extends BankAccount {
	public SavingsAccount(int accNo, String name, double bal) {
		super(accNo, name, bal);
	}

	public void addInterest(double rate) {
		balance += balance * (rate / 100);
	}
}

class CurrentAccount extends BankAccount {
	public CurrentAccount(int accNo, String name, double bal) {
		super(accNo, name, bal);
	}

	public void applyServiceCharge(double charge) {
		balance -= charge;
	}
}

public class BankingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SavingsAccount sa = new SavingsAccount(sc.nextInt(), sc.next(), sc.nextDouble());
		sa.deposit(1000);
		sa.addInterest(5);
		System.out.println("Savings Account Balance: " + sa.balance);

		CurrentAccount ca = new CurrentAccount(sc.nextInt(), sc.next(), sc.nextDouble());
		ca.withdraw(500);
		ca.applyServiceCharge(100);
		System.out.println("Current Account Balance: " + ca.balance);
	}
}
