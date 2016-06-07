package kursovik.utils;

import kursovik.product.Product;

import java.util.List;

/**
 * @author Ihor Solohub.
 */
public interface FilterInter {
    public List<Product> filter(List<Product> products);
}
