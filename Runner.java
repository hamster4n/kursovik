package kursovik;

import kursovik.product.*;
import kursovik.utils.*;

import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductsList.createProducts();   // (1 Task Print all products)
        System.out.println("All products: " +'\n' + products);

        /*(2 Task Find all products with price from 1000 to 2000 uah)*/
        ListFilterCriterions minMaxPrice = new ListFilterCriterions();
        minMaxPrice.add(new FilterByMinMaxPrice(1000,2000));
        List<Product> productsWithMinMaxPrice = Filter.filter(products, minMaxPrice.getFilterCriterions());

        /*(3 Task Products price from 1000 to 2000 uah in descending order)*/
        Collections.sort(productsWithMinMaxPrice, Collections.reverseOrder(SortingCriterion.PRICE));
        System.out.println("Products with price from 1000 to 2000 uah in descending order: " +'\n' + productsWithMinMaxPrice);

        /*(4 Task Find all rods with price more than 500 uah in ascending order and in case of equal price
        sort by name in ascending order)*/
        ListFilterCriterions categoryAndPrice = new ListFilterCriterions();

        categoryAndPrice.add(new FilterByCategory("Rod")).add(new FilterByPrice(500));

        List<Product> rodsWithPriceMore500 = Filter.filter(products, categoryAndPrice.getFilterCriterions());
        Collections.sort(rodsWithPriceMore500,new Multicomparator(SortingCriterion.PRICE,SortingCriterion.NAME));
        System.out.println("Rods with price more than 500 uah in ascending order " +
               "(in case equal price sorted by name in ascending order)" +'\n' +rodsWithPriceMore500);
    }
}
