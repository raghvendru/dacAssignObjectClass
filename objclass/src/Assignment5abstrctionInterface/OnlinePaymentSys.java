package Assignment5abstrctionInterface;
//: Online Payment System
//•	Create an interface Payment with methods processPayment(double amount) and refund(double amount).
//•	Implement it in classes CreditCardPayment and UPIPayment, each with instance variables like transactionId, accountNumber.
//•	Provide constructors in each class to initialize these variables.
//•	Demonstrate making a payment and refund using both payment methods
interface Payment{
	void processPayment(double amount);
	void refund(double amount);
}
class CreditCardPayment implements Payment{
	int transId;
	int actNo;
	public CreditCardPayment(int t,int a) {
		this.transId = t;
		this.actNo = a;
	}
	public void processPayment(double amount) {
		System.out.println("Your payment is processed: transaction id is : "+transId + "of rupees : "+ amount);
	}
	
	public void refund(double ammount) {
		System.out.println("your refund of: "+ammount+" trans id is : "+transId);
	}
}
class UPIPayment implements Payment{
	int transId;
	int actNo;
	public UPIPayment(int t,int a) {
		this.transId = t;
		this.actNo = a;
	}
	public void processPayment(double amount) {
		System.out.println("Your payment is processed: transaction id is : "+transId + "of rupees : "+ amount);
	}
	
	public void refund(double ammount) {
		System.out.println("your refund of: "+ammount+" trans id is : "+transId);
	}
}
public class OnlinePaymentSys {
	public static void main(String[] args) {
		Payment p;
		p = new CreditCardPayment(123,558);
	    p.processPayment(250);
	    p.refund(5550);
	    p = new UPIPayment(123,558);
	    p.processPayment(250);
	    p.refund(5550);
	    
	    
	}

}
