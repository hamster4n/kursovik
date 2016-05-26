package kursovik.utils;

import kursovik.product.Bait;
import kursovik.product.Coil;
import kursovik.product.Product;
import kursovik.product.Rod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 26.05.2016.
 */
public final class FindingUtils {

    private FindingUtils() {

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

    public static List<Rod> findByRodType(List<Product> products, String rodType) { // String rodType - TILL BE READY ENUM ROD_TYPE!!!!
        List<Product> productsRods = findByCategory(products, "Rod" /*string ROD (Category of product)*/);
        List<Rod> rods = new ArrayList<>();
        for (Product prod : productsRods) {
            if (prod instanceof Rod) {  // Нисхідне перетворення типів
                rods.add((Rod) prod);
            }
        }
        List<Rod> result = new ArrayList<>();

        for (Rod rod : rods) {
            if (rod.getRodType().equals(rodType)) {
                result.add(rod);
            }
        }
        return result;
    }

    public static List<Rod> findByMinKasting(List<Product> products, int castingMin) {
        List<Product> productsRods = findByCategory(products, "Rod" /*ROD instead Category*/);
        List<Rod> rods = new ArrayList<>();
        for (Product prod : productsRods) {     // Нисхідне перетворення типів
            if (prod instanceof Rod) {  // Нисхідне перетворення типів
                rods.add((Rod) prod);
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
        for (Product prod : productsRods) {     // Нисхідне перетворення типів
            if (prod instanceof Rod) {  // Нисхідне перетворення типів
                rods.add((Rod) prod);
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
        for (Product prod : productsCoils) {
            if (prod instanceof Coil) {// Нисхідне перетворення типів
                coils.add((Coil) prod);
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
        for (Product prod : productsCoils) {     // Нисхідне перетворення типів
            if (prod instanceof Coil) {// Нисхідне перетворення типів
                coils.add((Coil) prod);
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
        List<Product> productsCoils = findByCategory(products, "Coil" /*COIL - String in Product*/);
        List<Coil> coils = new ArrayList<>();
        for (Product prod : productsCoils) {     // Нисхідне перетворення типів
            if (prod instanceof Coil) {// Нисхідне перетворення типів
                coils.add((Coil) prod);
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

    public static List<Bait> findByColor(List<Product> products, String color) {
        List<Product> productsBaits = findByCategory(products, "Bait" /*Bait*/);
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
        List<Product> productsBaits = findByCategory(products, "Bait" /*Bait*/);
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
}
