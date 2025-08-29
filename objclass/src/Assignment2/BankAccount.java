package Assignment2;

public class BankAccount {
	long actNo ;
	String holderName;
	double balance;
	
	public BankAccount(long actNo,String holderName,double balance) {
		this.actNo = actNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	

	public void deposite(double amt) {
		balance = balance+amt;
		System.out.println("After deposite,bank balance is: "+balance);
	}
	
	public void withdraw(double amt) {
		balance = balance-amt;
		System.out.println("After withdrawing ,bank balance is: "+balance);
	}
	
	public void checkBlance() {
		System.out.println("balance is :"+balance);
	}
	
	
	public void printDetails() {
		System.out.println("Account num: " + actNo + " name of holder : "+holderName+ " balance is: "+balance);
	}

}
