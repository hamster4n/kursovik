package kursovik.utils;

import kursovik.product.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 26.05.2016.
 */
public final class findingUtils {

    private findingUtils() {

    }

    public static List<Product> findByCategory(List<Product> products, String category) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(category)) { // NEED ADD CATEGORY TO PRODUCT!
                result.add(product);
            }
        }
        return result;
    }

    public static List<Rod> findByRodType(List<Product> products, String rodType) { // Enum RodType - COMPILATION OK! :)
        List<Product> productsRods = findByCategory(products, "Rod");
        List<Rod> rods = new ArrayList<>();
        for (Product product : productsRods) {
            if (product instanceof Rod) {  // Нисхідне перетворення типів
                rods.add((Rod) product);
            }
        }
        List<Rod> result = new ArrayList<>();
        for (Rod rod : rods) {
            if (rod.getRodType().equals(rodType)) { // Перевірить коректність роботи, хз чи правильно робитиме.
                result.add(rod);
            }
        }
        return result;
    }

    public static List<Rod> findByMinСasting(List<Product> products, int castingMin) {
        List<Product> productsRods = findByCategory(products, "Rod" /*ROD instead Category*/);
        List<Rod> rods = new ArrayList<>();
        for (Product product : productsRods) {     // Нисхідне перетворення типів
            if (product instanceof Rod) {  // Нисхідне перетворення типів
                rods.add((Rod) product);
            }
        }
        List<Rod> result = new ArrayList<>();
        for (Rod rod : rods) {
            if (rod.getCastingMin() == castingMin) {
                result.add(rod);
            }
        }
        return result;
    }

    public static List<Rod> findByMaxCasting(List<Product> products, int castingMax) {
        List<Product> productsRods = findByCategory(products, "Rod" /*ROD*/);
        List<Rod> rods = new ArrayList<>();
        for (Product product : productsRods) {     // Нисхідне перетворення типів
            if (product instanceof Rod) {  // Нисхідне перетворення типів
                rods.add((Rod) product);
            }
        }
        List<Rod> result = new ArrayList<>();
        for (Rod rod : rods) {
            if (rod.getCastingMax() == castingMax) {
                result.add(rod);
            }
        }
        return result;
    }

    public static List<Coil> findByCoilType(List<Product> products, String coilType) {
        List<Product> productsCoils = findByCategory(products, "Coil" /*COIL - String in Product*/);
        List<Coil> coils = new ArrayList<>();
        for (Product product : productsCoils) {
            if (product instanceof Coil) {// Нисхідне перетворення типів
                coils.add((Coil) product);
            }
        }
        List<Coil> result = new ArrayList<>();
        for (Coil coil : coils) {
            if (coil.getCoilType().equals(coilType)) {
                result.add(coil);
            }
        }
        return result;
    }

    public static List<Coil> findByPresenceSecondSpool(List<Product> products, boolean isSecondSpoolHas) {
        List<Product> productsCoils = findByCategory(products, "Coil" /*COIL - String in Product*/);
        List<Coil> coils = new ArrayList<>();
        for (Product product : productsCoils) {     // Нисхідне перетворення типів
            if (product instanceof Coil) {// Нисхідне перетворення типів
                coils.add((Coil) product);
            }
        }
        List<Coil> result = new ArrayList<>();
        for (Coil coil : coils) {
            if (coil.getIsSecondSpoolHas()) {
                result.add(coil);
            }
        }
        return result;
    }

    public static List<Coil> findByNumberOfBearings(List<Product> products, int numberOfBearings) {
        List<Product> productsCoils = findByCategory(products, "Coil");
        List<Coil> coils = new ArrayList<>();
        for (Product product : productsCoils) {     // Нисхідне перетворення типів
            if (product instanceof Coil) {// Нисхідне перетворення типів
                coils.add((Coil) product);
            }
        }
        List<Coil> result = new ArrayList<>();
        for (Coil coil : coils) {
            if (coil.getNumberOfBearings() == numberOfBearings) {
                result.add(coil);
            }
        }
        return result;
    }

    public static List<Bait> findByBaitType(List<Product> products, String baitType){
        List<Product> productsBaits = findByCategory(products, "Bait");
        List<Bait> baits = new ArrayList<>();
        for (Product product : productsBaits) {     // Нисхідне перетворення типів
            if (product instanceof Bait) {
                baits.add((Bait) product);
            }
        }
        List<Bait> result = new ArrayList<>();
        for (Bait bait: baits){
            if (bait.getBaitType().equals(baitType)){
                result.add(bait);
            }
        }
        return result;
    }


    public static List<Bait> findByColor(List<Product> products, String color) {
        List<Product> productsBaits = findByCategory(products, "Bait");
        List<Bait> baits = new ArrayList<>();
        for (Product prod : productsBaits) {     // Нисхідне перетворення типів
            if (prod instanceof Bait) {
                baits.add((Bait) prod);
            }
        }
        List<Bait> result = new ArrayList<>();
        for (Bait bait : baits) {
            if (bait.getColor().equals(color)) {
                result.add(bait);
            }
        }
        return result;
    }

    public static List<Bait> findByWeight(List<Product> products, int weight) {
        List<Product> productsBaits = findByCategory(products, "Bait");
        List<Bait> baits = new ArrayList<>();
        for (Product prod : productsBaits) {     // Нисхідне перетворення типів
            if (prod instanceof Bait) {
                baits.add((Bait) prod);
            }
        }
        List<Bait> result = new ArrayList<>();
        for (Bait bait : baits) {
            if (bait.getWeight() == weight) {
                result.add(bait);
            }
        }
        return result;
    }

    public static Product findById(List<Product> products, int productId) {
        Product productWithId = null;
        for (Product product : products) {
            if (product.getProductID() == productId) {
                productWithId = product;
            }
        }
        return productWithId;
    }

    public static List <Product> findByPrice(List<Product> products, int price){
        List<Product> result = new ArrayList<>();
        for (Product product:products){
            if (product.getPrice()> price){
                result.add(product);
            }
        }
        return result;
    }

    public static List<Product> findProductsFromMinPriceToMax (List<Product> products, int minPrice, int maxPrice){
        List<Product> result = new ArrayList<>();
        for (Product product:products){
            if (product.getPrice()>= minPrice && product.getPrice()<= maxPrice){
                result.add(product);
            }
        }
        return result;
    }

    public static List<Product> findByTypeAndPrice(List<Product> products, int price, String category){
        List<Product> productsType = findByCategory(products, category);
        List<Product> result = findByPrice(productsType, price);
        return result;
    }
}
