package kursovik.utils;

import kursovik.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ihor Solohub.
 */
public class Filter {

    public static List<Product> filter (List<Product> products, List<FilterInter> filterCriterions) {
        List<Product> result = new ArrayList<>();
        for (FilterInter criteria : filterCriterions) {
            result = criteria.filter(products);
            products = result;
        }
        return result;
    }
}
