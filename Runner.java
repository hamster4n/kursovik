package kursovik;

import kursovik.product.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hamster4n.
 */
public class Runner {
    public static void main(String[] args) {
        List<Product> products = createProducts();

        //List<Product> productsByType = Product.findByType(products, "spinning");
        //System.out.println("type spinnings: " + productsByType);

        System.out.println(products);



    }

    public static List<Product> createProducts(){
        List<Product> products = new ArrayList<>();

        products.add(new Rod(1, "Globus", 1500, EnumRodType.spinning, 10, 40));
        products.add(new Rod(2, "BlueBird", 1400, EnumRodType.spinning, 1, 5));
        products.add(new Rod(3, "WhiteBird", 700, EnumRodType.spinning, 1, 5));
        products.add(new Rod(4, "New Hanter 5m", 500, EnumRodType.fishingRod, 5, 10));
        products.add(new Rod(5, "New Hanter 4m", 400, EnumRodType.fishingRod, 5, 10));
        products.add(new Rod(6, "Trabooko", 4500, EnumRodType.fishingRod, 2, 8));
        products.add(new Rod(7, "Daiwa Extra Heavy 3,4m", 4500, EnumRodType.feeder, 20, 150));
        products.add(new Rod(8, "Daiwa Heavy 3,9m", 3900, EnumRodType.feeder, 20, 100));
        products.add(new Rod(9, "Korum peaker 2,05m", 1200, EnumRodType.feeder, 20, 40));
        products.add(new Coil(10, "Daiwa Megaforce 2500", 1400, EnumCoilType.inrtialessCoil, 6, true));
        products.add(new Coil(11, "Daiwa 12 Catalina 4500", 21000, EnumCoilType.inrtialessCoil, 10, true));
        products.add(new Coil(12, "Lineaeffe Vigor Pegaso FD 20", 194, EnumCoilType.inrtialessCoil, 1, false));
        products.add(new Coil(13, "Lineaeffe Colorado 101", 980, EnumCoilType.multiplierCoil, 1, false));
        products.add(new Coil(14, "Daiwa Millionaire S250", 2560, EnumCoilType.multiplierCoil, 3, false));
        products.add(new Coil(15, "Dragon SHS200il", 3875, EnumCoilType.multiplierCoil, 11, false));
        products.add(new Bait(16, "Usami Kama 70F", 89, EnumBaitType.wobbler, "green", 9));
        products.add(new Bait(17, "Yo-Zuri 3DS Minnow 70SP", 269, EnumBaitType.wobbler, "silver", 7));
        products.add(new Bait(18, "Imakatsu Buzz Bill Minnow", 808, EnumBaitType.wobbler, "yellow", 11));
        products.add(new Bait(19, "Blue Fox Vibrax Fluorescent", 126, EnumBaitType.spoon, "gold", 13));
        products.add(new Bait(20, "Balzer Coloner Classic Standard Uni", 44, EnumBaitType.spoon, "gold", 5));
        products.add(new Bait(21, "Mepps Aglis Long", 59, EnumBaitType.spoon, "golden", 6));
        products.add(new Bait(22, "Twister Dragon Dancer 1.5", 67, EnumBaitType.silicon, "silver", 0));
        products.add(new Bait(23, "Nomura Glitter Rib Worm 4", 87, EnumBaitType.silicon, "purple", 0));
        products.add(new Bait(24, "Keitech Crazy Flapper 3.6", 130, EnumBaitType.silicon, "green", 0));

        return products;
    }
}
