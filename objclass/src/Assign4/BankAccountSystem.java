package Assign4;

class BankAccount{
	int  acctNo;
	float bal;
	public BankAccount(int a,float b) {
		this.acctNo = a;
		this.bal = b;
	}
	
	public double calInt() {
		return bal*0.02;
	}
}

 class SavingsAccount extends BankAccount{
	public SavingsAccount(int a,float b) {
		super(a,b);
	}
	@Override
	public double calInt() {
		return bal*0.04;
	}
}
 class FixedDepositAccount extends BankAccount{
		public FixedDepositAccount(int a,float b) {
			super(a,b);
		}
		public double calInt() {
			return bal*0.07;
		}
	}
public class BankAccountSystem {
public static void main(String[] args) {
	BankAccount b;
	b = new SavingsAccount(123,22000);
	System.out.println(	b.calInt());
	b = new FixedDepositAccount(456,54222);
	System.out.println(	b.calInt());
}
}
