package kursovik.utils;

import kursovik.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ihor Solohub.
 */
public class FilterByPrice implements FilterInter {
    private int price;

    public FilterByPrice(int price) {
        this.price = price;
    }

    public List<Product> filter(List<Product> products){
        List<Product> result = new ArrayList<>();
        for (Product product:products){
            if (product.getPrice()> price){
                result.add(product);
            }
        }
        return result;
    }
}
