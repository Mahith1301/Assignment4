package InventoryManagementSystem;

import InventoryManagementSystem.*;
import java.util.*;
 class Main{
    
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        InventoryManager inventoryManager = new InventoryManager(warehouse);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Inventory");
            System.out.println("4. Process Order");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct(warehouse);
                    break;
                case 2:
                    removeProduct(warehouse);
                    break;
                case 3:
                    warehouse.displayInventory();
                    break;
                case 4:
                    processOrder(inventoryManager);
                    break;
                case 5:
                    System.out.println("Exiting Inventory Management System. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    private static void addProduct(Warehouse warehouse) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: $");
        double price = scanner.nextDouble();
        System.out.print("Enter initial stock quantity: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Choose product category (1. Electronics, 2. Clothing): ");
        int categoryChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Product product;

        switch (categoryChoice) {
            case 1:
                System.out.print("Enter brand for Electronics: ");
                String brand = scanner.nextLine();
                product = new Electronics(name, price, stock, brand);
                break;
            case 2:
                System.out.print("Enter size for Clothing: ");
                String size = scanner.nextLine();
                product = new Clothing(name, price, stock, size);
                break;
            default:
                System.out.println("Invalid category choice.");
                return;
        }

        warehouse.addProduct(product);
        System.out.println("Product added successfully.");
    }

    private static void removeProduct(Warehouse warehouse) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name to remove: ");
        String productName = scanner.nextLine();

        warehouse.removeProduct(productName);
        System.out.println("Product removed successfully.");
    }

    private static void processOrder(OrderManager orderManager) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name to order: ");
        String productName = scanner.nextLine();
        System.out.print("Enter quantity to order: ");
        int quantity = scanner.nextInt();

        orderManager.processOrder(productName, quantity);
    }
    
}
