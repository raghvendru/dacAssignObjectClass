package Assignment2;

class CartItem {
    int itemId;
    String itemName;
    double price;
    int quantity;

    public CartItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }
}

class ShoppingCart {
    CartItem[] items;

    public ShoppingCart(CartItem[] items) {
        this.items = items;
    }

    public double calculateFinalAmount() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotal();
        }
        if (total > 5000) { 
            total *= 0.9; 
        }
        return total;
    }
}
 class TestShoppingCart {
    public static void main(String[] args) {
        CartItem[] items = {
            new CartItem(1, "Phone", 2000, 2),
            new CartItem(2, "Headphones", 1500, 1),
            new CartItem(3, "Charger", 500, 3)
        };

        ShoppingCart cart = new ShoppingCart(items);
        System.out.println("Final Payable Amount: " + cart.calculateFinalAmount());
    }
}

