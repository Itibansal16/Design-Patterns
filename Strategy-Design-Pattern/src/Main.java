import model.Cart;
import model.Product;
import model.ProductSize;
import model.Region;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(Region.AP);
        cart.addProduct(new Product(200.0, "abc", "Black Dress", ProductSize.S));
        cart.addProduct(new Product(1200.0, "abc", "Tank Top", ProductSize.XS));
        cart.addProduct(new Product(2200.0, "abc", "Wide Leg Jeans", ProductSize.L));
        cart.addProduct(new Product(3000.0, "abc", "T-Shirt", ProductSize.XL));

        String price = cart.getCost();
        System.out.println(price);
    }
}