package Shoppingcart;

import java.util.*;

public class ProductCartTest {
	public static void main(String[] args) {
		CartManager cart = new CartManager();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(
					"can you please enter the choice 1)addProduct 2)view Cart 3)update cart 4)delete cart 5)get bill details");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Please add to cart");
				cart.addProduct();
				break;
			case 2:
				System.out.println("the product details in cart are: ");
				cart.viewCart();
				break;
			case 3:
				cart.updateProd();
				break;
			case 5:
				System.out.println("the product details in cart are: ");
				cart.getTotalBill();
				break;
			default:
				System.out.println("invalid id");
				return;
			case 4:
				cart.deleteProd();
				break;

			}
		}
	}
}
