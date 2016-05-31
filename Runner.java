package kursovik;

import kursovik.product.*;
import kursovik.utils.FindingUtils;
import kursovik.utils.ProductSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductsList.createProducts();   // (1 Task)
        System.out.println("All products: " +'\n' + products);

        List<Product> productsWithMinMaxPrice = FindingUtils.findProductsFromMinPriceToMax(products, 1000, 2000); //(2 Task)
        Collections.sort(productsWithMinMaxPrice, ProductSorter.PRICE); //(3 Task)
        System.out.println("Products price from 1000 to 2000 uah in ascending order: " +'\n' + productsWithMinMaxPrice);

        List<Product> rodsWithPriceMore500 = FindingUtils.findByTypeAndPrice(products, 500, "Rod");
        Collections.sort(rodsWithPriceMore500, ProductSorter.PRICE_AND_NAME); // (4 Task)
        System.out.println("Rods with price more than 500 uah and in ascending order " +
                "(in case equal price sorted by name in ascending order)" +'\n' +rodsWithPriceMore500);
    }
}
