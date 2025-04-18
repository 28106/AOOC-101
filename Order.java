package Ecommerce;

public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public void placeOrder() {
        System.out.println("----- Order Summary -----");
        customer.displayCustomer();
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + calculateTotal());
    }

    public double calculateTotal() {
        return quantity * product.getPrice();
    }
}
