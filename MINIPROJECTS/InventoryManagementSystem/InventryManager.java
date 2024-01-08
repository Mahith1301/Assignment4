package InventoryManagementSystem;
import java.util.*;
// OrderManager interface
interface OrderManager {
    void processOrder(String productName, int quantity);
}

// InventoryManager class implementing OrderManager
class InventoryManager implements OrderManager {
    private Warehouse warehouse;

    public InventoryManager(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void processOrder(String productName, int quantity) {
        warehouse.processOrder(productName, quantity);
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
