package Assignment2;

public class Product {
  int prodid;
  String prodName;
  double price;
  int qty;
  
  public Product(int prodid,String prodName,double price,int qty ) {
	  this.prodid= prodid;
	  this.prodName = prodName;
	  this.price =price;
	  this.qty = qty;
  }
  
  public double totBill() {
	  return (qty*price);
  }
}
