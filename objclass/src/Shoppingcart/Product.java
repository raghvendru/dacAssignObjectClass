package Shoppingcart;

public class Product {
	int pId;
	String pName;
	float price;
	int qty;
	static int pCount = 0;

	public Product(int id,String n,float p,int q) {
    	this.pId = id;
    	this.pName = n;
    	this.price =p;
    	this.qty = q;
    	pCount++;
    }
	
	

}
