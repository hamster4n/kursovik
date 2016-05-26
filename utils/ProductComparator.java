package kursovik.utils;

import kursovik.product.Product;

/**
 * Created by Администратор on 26.05.2016.
 */
public enum  ProductComparator {
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
    };
}
