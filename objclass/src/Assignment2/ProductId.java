package Assignment2;

public class ProductId {
public static void main(String[] args) {
	Product[] p = new Product[2];
	Product[] products  = {new Product(1,"books",55.22,2),new Product(2,"pens",99,6)};
	
	for(Product p1:products) {
		double ans = p1.totBill();
		System.out.println("your total bill is:"+ans);
	}
}
}
