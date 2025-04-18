import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.Order;

public class Shop {
    public static void main(String[] args) {
        Product p = new Product("Smartphone", 18000);
        Customer c = new Customer("Aarav", "aarav@gmail.com");
        Order o = new Order(c, p, 3);
        o.placeOrder();
    }
}
