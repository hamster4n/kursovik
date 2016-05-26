package kursovik;

import kursovik.product.Product;
import kursovik.product.Rod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hamster4n.
 */
public class Runner {
    public static void main(String[] args) {
        List<Product> products = createProducts();

    }

    public static List<Product> createProducts(){
        List<Product> products = new ArrayList<>();

        products.add(new Rod(1, "Глобус фантастиш", 1500, "spinning", 10, 40));
        products.add(new Rod(2, "BlueBird", 1400, "spinning", 1, 5));
        products.add(new Rod(3, "WhiteBird", 700, "spinning", 1, 5));
        return products;
    }
}
