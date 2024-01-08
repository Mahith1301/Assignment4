package InventoryManagementSystem;

public abstract class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int quantity) {
        stock += quantity;
    }

    public void removeStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Insufficient stock for " + name);
        }
    }

    public abstract String getCategory();

    public abstract void displayInfo();
}


class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, int stock, String brand) {
        super(name, price, stock);
        this.brand = brand;
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }

    @Override
    public void displayInfo() {
        System.out.println("Product: " + getName() + " (Brand: " + brand + ")");
        System.out.println("Category: " + getCategory());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock: " + getStock() + " units");
    }
}

// Concrete class for Clothing
class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    @Override
    public String getCategory() {
        return "Clothing";
    }

    @Override
    public void displayInfo() {
        System.out.println("Product: " + getName() + " (Size: " + size + ")");
        System.out.println("Category: " + getCategory());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock: " + getStock() + " units");
    }
}