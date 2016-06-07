package kursovik.utils;

import kursovik.product.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Ihor Solohub.
 */
public class Multicomparator implements Comparator<Product> {

    private List<Comparator<Product>> listComparators;
    private OrderedComparetor orderedComparetor;

    public Multicomparator(Comparator<Product> ... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }

    public int compare(Product a, Product b) {
        for (Comparator<Product> comparator : listComparators) {
            int result = comparator.compare(a, b);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
