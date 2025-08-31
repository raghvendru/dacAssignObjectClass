package Assignment3;
import java.util.*;
class Product{
	String pName;
	double price;
	
	
	public void showProduct() {
		System.out.println("product name is : "+ pName +" price of product is:  " + price);
	}
}
class DiscountedProduct extends Product {
	int discPrice;
	public DiscountedProduct(String s,double p,int dp) {
		this.pName = s;
		this.price = p;
		this.discPrice = dp;
	}
	
	public double calculateFinalPrice() {
		return price-(price*discPrice)/100;
	}
}
public class ProductBillingSystem {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	DiscountedProduct[] d = new DiscountedProduct[2];
	for(int i=0;i<d.length;i++) {
		d[i] = new DiscountedProduct(sc.next(),sc.nextDouble(),sc.nextInt());
		d[i].showProduct();
		System.out.println("price of the product after discount "+d[i].discPrice+" % is " + d[i].calculateFinalPrice() );
	}
}
}
