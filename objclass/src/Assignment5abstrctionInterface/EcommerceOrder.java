package Assignment5abstrctionInterface;
//E-Commerce Order
//•	Create an abstract class Order with instance variables orderId, customerName, and amount.
//•	Add an abstract method generateInvoice().
//•	Subclasses OnlineOrder and StoreOrder should have constructors to initialize order details.
//•	Implement generateInvoice() differently:
//o	OnlineOrder adds delivery charges.
//o	StoreOrder adds discount for in-store pickup.
//•	Write a test class to create different orders and display invoices
abstract class Order{
	int oId;
	String name;
	double amt;
	public Order(int i,String n,double a) {
		this.oId = i;
		this.name = n;
		this.amt = a;
	}
	public abstract double genInvoice();
}

class OnlineOrder extends Order{
	public OnlineOrder(int i,String n,double a){
		super(i,n,a);
	}
	
	public double genInvoice() {
		int delCharges = 75;
		return amt+delCharges;
	}
}
class StoreOrder extends Order{
	public StoreOrder(int i,String n,double a){
		super(i,n,a);
	}
	
	public double genInvoice() {
		int disc = 75;
		return amt-disc;
	}
}
public class EcommerceOrder {
public static void main(String[] args) {
	Order o ;
	o = new OnlineOrder(1001,"raghav",557);
	System.out.println(o.genInvoice());
	o = new StoreOrder(1001,"raghav",557);
	System.out.println(o.genInvoice());
}
}
