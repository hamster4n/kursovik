package kursovik.utils;

import kursovik.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ihor Solohub.
 */
public class FilterByMinMaxPrice implements FilterInter {

    private int minPrice;
    private int maxPrice;

    public FilterByMinMaxPrice(int minPrice, int maxPrice){
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public List<Product> filter (List<Product> products){
        List<Product> result = new ArrayList<>();
        for (Product product:products){
            if (product.getPrice()>= this.minPrice && product.getPrice()<= this.maxPrice){
                result.add(product);
            }
        }
        return result;
    }
}
