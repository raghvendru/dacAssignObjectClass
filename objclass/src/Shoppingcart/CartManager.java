package Shoppingcart;
import java.util.*;
public class CartManager {
	Product[] prod = new Product[2];
	Scanner sc = new Scanner(System.in);
	
	public void addProduct() {
		for(int i=0;i<prod.length;i++) {
			prod[i] = new Product(sc.nextInt(),sc.next(),sc.nextFloat(),sc.nextInt());
		}
	}
	
	public void viewCart() {
		for(int i=0;i<prod.length;i++) {
			if (prod[i] != null) {
			//System.out.println("Product details of id :"+prod[i].pId);
			System.out.println("product id : " + prod[i].pId + " product name is : " + prod[i].pName+ " product quantity is: "+ prod[i].qty + " Product cost is : "+prod[i].price + " product count is: " +Product.pCount);
		    System.out.println("Total products in cart: " + Product.pCount);

			}
		}
	}
	
	public void updateProd() {
		System.out.println("enter product id which you want update ");
		int n = sc.nextInt();
		for(int i=0;i<prod.length;i++) {
			if(n == prod[i].pId) {
				prod[i].qty = 200;
			}
		}
		System.out.println("after updating ,the updated details are: ");
		viewCart();
	}
	
	public void getTotalBill() {
		float bill = 0;
		for(int i=0;i<prod.length;i++) {
			bill += (prod[i].qty)*(prod[i].price);
		}
		System.out.println("total bill is: "+bill);
	}
	
	public void deleteProd() {
	    boolean found = false;
	    System.out.println("enter id which u want to delete");
	    int n = sc.nextInt();
	    for(int i=0;i<prod.length;i++) {
	        if(prod[i] != null && n == prod[i].pId) {
	            found = true;
	            for(int j = i;j<prod.length-1;j++) {
	                prod[j] = prod[j+1];
	            }
	            prod[prod.length-1] = null;
	            Product.pCount--;
	            break;
	        }
	    }
	    if(!found) {
	        System.out.println("Product with id " + n + " not found.");
	    }
	    System.out.println("after deleting, the updated cart is: ");
	    viewCart();   
	}

}
