package Ecommerce;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: ₹" + price);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
