package OnlineShoppingSystem;

import OnlineShoppingSystem.*;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);

        // Creating a customer 
        Customer customer = new Customer("john_doe", "password");

        while (true) {
            System.out.println("\nOnline Shopping System Menu:");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Process Order");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            System.out.println("items of Electronics catagery : laptop(price 79999) mobile (19999)");
            System.out.println("items of Clothings are jeans(price 999) shirt(price 499)");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addItemToCart(inventoryManager, customer);
                    break;
                case 2:
                    removeItemFromCart(customer);
                    break;
                case 3:
                    viewCart(customer);
                    break;
                case 4:
                    processOrder(inventoryManager, customer);
                    break;
                case 5:
                    System.out.println("Exiting Online Shopping System. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }}}
            private static void addItemToCart(InventoryManager inventoryManager, Customer customer) {
                Scanner scanner = new Scanner(System.in);
            
                System.out.print("Enter product name to add to cart: ");
                String productName = scanner.nextLine();
            
                Product product = findProductByName(productName, inventoryManager.inventory);
                if (product != null) {
                    customer.getShoppingCart().addItem(product);
                    System.out.println(productName + " added to the cart.");
                } else {
                    System.out.println("Product not found: " + productName);
                }
            }
        
            private static void removeItemFromCart(Customer customer) {
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Enter product name to remove from cart: ");
                String productName = scanner.nextLine();
        
                Product product = findProductByName(productName, customer.getShoppingCart().getItems());
                if (product != null) {
                    customer.getShoppingCart().removeItem(product);
                    System.out.println(productName + " removed from the cart.");
                } else {
                    System.out.println("Product not found in the cart: " + productName);
                }
            }
        
            private static void viewCart(Customer customer) {
                List<Product> cartItems = customer.getShoppingCart().getItems();
        
                if (cartItems.isEmpty()) {
                    System.out.println("The shopping cart is empty.");
                } else {
                    System.out.println("Items in the shopping cart:");
                    for (Product item : cartItems) {
                        item.displayInfo();
                    }
                }
            }
        
            private static void processOrder(InventoryManager inventoryManager, Customer customer) {
                inventoryManager.processOrder(customer);
            }
        
            private static Product findProductByName(String productName, List<Product> productList) {
                for (Product product : productList) {
                    if (product.getName().equalsIgnoreCase(productName)) {
                        return product;
                    }
                }
                return null;
            }
        
        
        }

