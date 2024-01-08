package OnlineShoppingSystem;

public class Customer {
    private String username;
    private String password;
    private ShoppingCart shoppingCart;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        this.shoppingCart = new ShoppingCart();
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
