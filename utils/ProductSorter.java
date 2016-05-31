package kursovik.utils;

import kursovik.product.Product;

import java.util.Comparator;

/**
 * Created by Администратор on 26.05.2016.
 */
public enum ProductSorter implements Comparator<Product>{
    PRODUCT_ID{
        public int compare (Product a, Product b){
            return Integer.compare(a.getProductID(),b.getProductID());
        }
    },
    NAME{
        public int compare (Product a, Product b){
            return a.getName().compareTo(b.getName());
        }
    },
    PRICE{
        public int compare(Product a, Product b){
            return Integer.compare(a.getPrice(), b.getPrice());
        }
    },
    PRICE_AND_NAME{
        public int compare (Product a, Product b){
            if (a.getPrice()> b.getPrice()){
                return 1;
            }
            else if (a.getPrice()== b.getPrice()){
                return a.getName().compareTo(b.getName());
            }
            else {
                return -1;
            }
        }
    }

}
