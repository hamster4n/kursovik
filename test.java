package kursovik.UML;

import kursovik.product.Product;

import java.util.List;

/**
 * Created by Hamster4n.
 */
public class test {


    //вычисляем общую стоимость товара в корзине
    int priceProductList = productList.getPriceProductList;
    //вычисляем размер скидки
    int discount = priceProductList.addDiscount;
    // выводим на печать счёт на оплату
    printOrder(List<Product> productList, priceProductList, discount);





    //метод вычисляет общую стоимость товара в корзине
    public int getPriceProductList(List<Product> productList){
        return priceProductList;
    }
    //метод вычисляет размер скидки (возможно стоит переназвать в calculationDiscounts)
    public int addDiscount(List<Product> productList, priceProductList){
        int discount = 0;
        // метод расчёта скидки из общей стоимости товара
            int d1 = discountByQuantity
        // метод расчёта скидки из  колличества товара
            int d2 = discountBySumPrice
        // логика выбора скидки
        if (d1 > d2) {
            discount = d1;
        } else discount = d2;
        return discount;
    }

    //метод вычисляет скидку из общей стоимости товара
    public int discountByQuantity(List<Product> productList){
        int discount = 0;
        //дальше логика расчёта скидки

        return discount;
    }

    //метод вычисляет скидку из колличества товара
    public int discountBySumPrice (List<Product> produtList){
        int discount = 0;
        //дальше логика расчёта скидки

        return discount;
    }

    //метод выводит на печать счёт для оплаты
    public void printOrder (List<Product> productList, priceProductList, discount){
        //логика печати
    }
}
