package Assignment2;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount[] acc = new BankAccount[2];
		BankAccount[] accounts = {new BankAccount(123,"raghu",22400),new BankAccount(456,"ram",55220)};
		System.out.println("details");
		for(BankAccount b:accounts) {
			b.printDetails();
		}
		
		accounts[0].deposite(1000.00);
		accounts[1].withdraw(5000.00);
		accounts[0].deposite(2000.00);
		
		System.out.println("after deposit/withdrawing");
		for(BankAccount b:accounts) {
			b.checkBlance();
		}
	}
}