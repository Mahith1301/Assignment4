package OnlineShoppingSystem;

// Product abstract class
abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getCategory();

    public abstract void displayInfo();
}

// Concrete class for Electronics
class Electronics extends Product {


    public Electronics(String name, double price) {
        super(name, price);
      
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }

    @Override
    public void displayInfo() {
        System.out.println("Product: " + getName() );
        System.out.println("Category: " + getCategory());
        System.out.println("Price: " + getPrice());
    }
}

// Concrete class for Clothing
class Clothing extends Product {
  

    public Clothing(String name, double price) {
        super(name, price);

    }

    @Override
    public String getCategory() {
        return "Clothing";
    }

    @Override
    public void displayInfo() {
        System.out.println("Product: " + getName() );
        System.out.println("Category: " + getCategory());
        System.out.println("Price: " + getPrice());
    }
}
