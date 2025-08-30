package Assignment3;
import java.util.*;
class BankAct{
	public long actNo;
	public double balance;
	public double deposit(double amt) {
		balance += amt;
		return balance;
	}
}

class SavingsAct extends BankAct{
	double intrstRate;
	public SavingsAct(long a,double b,double ir) {
		this.actNo = a;
		this.balance =b;
		this.intrstRate = ir;
		
	}
	public double calcIntrest() {
		double intrest = (balance*intrstRate)/100;
		return intrest;
	}
}
public class BankAccountSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingsAct[] sav = new SavingsAct[2];
		
		for(int i=0;i<sav.length;i++) {
			sav[i] = new SavingsAct(sc.nextLong(),sc.nextDouble(),sc.nextDouble());

		}
		for(int i=0;i<sav.length;i++) {
			System.out.println("enter deposite");
			double amt = sc.nextDouble();
			System.out.println("after depositing "+amt+": Available balance is: ");
			System.out.println(sav[i].deposit(amt));
			System.out.println("total intrest is: "+sav[i].calcIntrest());
			
		}
		
		

	}
   

}
