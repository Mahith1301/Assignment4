package InventoryManagementSystem;
import java.util.*;
// Warehouse class
public class Warehouse {
    private Map<String, Product> inventory;

    public Warehouse() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getName(), product);
    }

    public void removeProduct(String productName) {
        inventory.remove(productName);
    }

    public void displayInventory() {
        for (Product product : inventory.values()) {
            product.displayInfo();
            System.out.println("------------------------");
        }
    }

    public void processOrder(String productName, int quantity) {
        Product product = inventory.get(productName);
        if (product != null) {
            product.removeStock(quantity);
            System.out.println("Order processed: " + quantity + " units of " + productName);
        } else {
            System.out.println("Product not found: " + productName);
        }
    }
}