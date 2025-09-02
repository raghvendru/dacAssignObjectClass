package Assign3MultiLevel;

import java.util.*;

class Product {
    int productId;
    String name;
    double price;

    public Product(int id, String n, double p) {
        this.productId = id;
        this.name = n;
        this.price = p;
    }
}

class Electronics extends Product {
    int warrantyYears;

    public Electronics(int id, String n, double p) {
        super(id, n, p);
    }

    public void applyWarranty(int years) {
        this.warrantyYears = years;
    }
}

class Clothing extends Product {
    public Clothing(int id, String n, double p) {
        super(id, n, p);
    }

    public double applyDiscount(double percentage) {
        return price - (price * percentage / 100);
    }
}

public class EcommerceStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Electronics e = new Electronics(sc.nextInt(), sc.next(), sc.nextDouble());
        e.applyWarranty(2);
        System.out.println("Electronics: " + e.name + ", Price: " + e.price + ", Warranty: " + e.warrantyYears + " years");

        Clothing c = new Clothing(sc.nextInt(), sc.next(), sc.nextDouble());
        double discountedPrice = c.applyDiscount(10);
        System.out.println("Clothing: " + c.name + ", Original Price: " + c.price + ", Discounted Price: " + discountedPrice);
    }
}
