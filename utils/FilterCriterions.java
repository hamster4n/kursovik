package kursovik.utils;

import kursovik.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ihor Solohub.
 */
public enum FilterCriterions {
    CATEGORY {
        public List<Product> filter(List<Product> products, String category) {
            List<Product> result = new ArrayList<>();
            for (Product product : products) {
                if (product.getCategory().equals(category)) {
                    result.add(product);
                }
            }
            return result;
        }
    },
    PRICE{
        public List <Product> filter(List<Product> products, int price){
            List<Product> result = new ArrayList<>();
            for (Product product:products){
                if (product.getPrice()> price){
                    result.add(product);
                }
            }
            return result;
        }
    };

}
