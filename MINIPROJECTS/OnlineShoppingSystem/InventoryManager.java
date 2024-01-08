package OnlineShoppingSystem;
import java.util.*;
// OrderManager interface
interface OrderManager {
    void processOrder(Customer customer);
}

// InventoryManager class implementing OrderManager
class InventoryManager implements OrderManager {
    List<Product> inventory;

    public InventoryManager() {
        this.inventory = new ArrayList<>();
        initializeInventory();
    }

    private void initializeInventory() {
        inventory.add(new Electronics("laptop", 79999));
        inventory.add(new Electronics("mobile",19999));
        inventory.add(new Clothing("jeans", 999));
        inventory.add(new Clothing("shirt", 499));
    }

    @Override
    public void processOrder(Customer customer) {
        List<Product> items = customer.getShoppingCart().getItems();

        if (items.isEmpty()) {
            System.out.println("Shopping cart is empty. Order not processed.");
        } else {
            System.out.println("Order processed for customer: " + customer.getUsername());
            System.out.println("Items in the order:");
            for (Product item : items) {
                item.displayInfo();
            }

            // Clear the shopping cart after processing the order
            customer.getShoppingCart().clearCart();
        }
    }
}
