package kursovik.utils;

import kursovik.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ihor Solohub.
 */
public class FilterByCategory implements FilterInter {
    private String category;

    public FilterByCategory(String category) {
        this.category = category;
    }

    public List<Product> filter(List<Product> products) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(this.category)) {
                result.add(product);
            }
        }
        return result;
    }

}
