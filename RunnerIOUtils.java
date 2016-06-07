package kursovik;


import kursovik.product.*;
import kursovik.utils.ProductIOUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hamster4n.
 */
public class RunnerIOUtils {
    public static final String FILE_NAME = "c:/Java/MyProjects/JavaOOP/src/kursovik/Products.csv";
    public static final String FILE_NAME_OUTPUT = "c:/Java/MyProjects/JavaOOP/src/kursovik/Products_output.csv";
    public static final String FILE_NAME_OUTPUT_BIN = "c:/Java/MyProjects/JavaOOP/src/kursovik/Products_output_bin";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Тест №1 на чтение Products.csv - пройден
//        try {
//            System.out.println(ProductIOUtils.readProductsFromFile(FILE_NAME));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Тест №2 на конвертацию Product в CSV - пройден
//        Product product = new Rod(1, "Globus", 1400, RodType.SPINNING, 10, 40);
//        System.out.println(ProductIOUtils.convertProductToCsv(product));
//        Product product1 = new Coil(10, "Daiwa Megaforce 2500", 1400, CoilType.INERTIALLESS_COIL, 6, true);
//        System.out.println(ProductIOUtils.convertProductToCsv(product1));
//        Product product2 = new Bait(19, "Blue Fox Vibrax Fluorescent", 126, BaitType.SPOON, "gold", 13);
//        System.out.println(ProductIOUtils.convertProductToCsv(product2));


        //Тест №3  на запись списка products в файл csv - пройден
//        List<Product> products = createProducts2();
//        ProductIOUtils.outputProductsIntoFile(products, FILE_NAME_OUTPUT);

        //Тест №4 на запись в бинарный файл - пройден
//        List<Product> products = createProducts2();
//        ProductIOUtils.outputBinaryProductsIntoFile(products, FILE_NAME_OUTPUT_BIN);

        //Тест №5 на чтение из бинарного файла - пройден
//        System.out.println(ProductIOUtils.readBinaryProductsFromFile(FILE_NAME_OUTPUT_BIN));

    }

    public static List<Product> createProducts2() {
        List<Product> products = new ArrayList<>();

        products.add(new Rod(1, "Globus", 1400, RodType.SPINNING, 10, 40));
        products.add(new Rod(2, "BlueBird", 1500, RodType.SPINNING, 1, 5));
        products.add(new Rod(3, "WhiteBird", 700, RodType.SPINNING, 1, 5));
        products.add(new Rod(4, "New Hanter 5m", 500, RodType.FISHING_ROD, 5, 10));
        products.add(new Rod(5, "New Hanter 4m", 400, RodType.FISHING_ROD, 5, 10));
        products.add(new Rod(6, "Trabooko", 4500, RodType.FISHING_ROD, 2, 8));
        products.add(new Rod(7, "Daiwa Extra Heavy 3,4m", 4500, RodType.FEEDER, 20, 150));
        products.add(new Rod(8, "Daiwa Heavy 3,9m", 3900, RodType.FEEDER, 20, 100));
        products.add(new Rod(9, "Korum peaker 2,05m", 1200, RodType.FEEDER, 20, 40));
        products.add(new Coil(10, "Daiwa Megaforce 2500", 1400, CoilType.INERTIALLESS_COIL, 6, true));
        products.add(new Coil(11, "Daiwa 12 Catalina 4500", 21000, CoilType.INERTIALLESS_COIL, 10, true));
        products.add(new Coil(12, "Lineaeffe Vigor Pegaso FD 20", 194, CoilType.INERTIALLESS_COIL, 1, false));
        products.add(new Coil(13, "Lineaeffe Colorado 101", 980, CoilType.MULTYPLIER_COIL, 1, false));
        products.add(new Coil(14, "Daiwa Millionaire S250", 2560, CoilType.MULTYPLIER_COIL, 3, false));
        products.add(new Coil(15, "Dragon SHS200il", 3875, CoilType.MULTYPLIER_COIL, 11, false));
        products.add(new Bait(16, "Usami Kama 70F", 89, BaitType.WOBBLER, "green", 9));
        products.add(new Bait(17, "Yo-Zuri 3DS Minnow 70SP", 269, BaitType.WOBBLER, "silver", 7));
        products.add(new Bait(18, "Imakatsu Buzz Bill Minnow", 808, BaitType.WOBBLER, "yellow", 11));
        products.add(new Bait(19, "Blue Fox Vibrax Fluorescent", 126, BaitType.SPOON, "gold", 13));
        products.add(new Bait(20, "Balzer Coloner Classic Standard Uni", 44, BaitType.SPOON, "gold", 5));
        products.add(new Bait(21, "Mepps Aglis Long", 59, BaitType.SPOON, "golden", 6));
        products.add(new Bait(22, "Twister Dragon Dancer 1.5", 67, BaitType.SILICON, "silver", 0));
        products.add(new Bait(23, "Nomura Glitter Rib Worm 4", 87, BaitType.SILICON, "purple", 0));
        products.add(new Bait(24, "Keitech Crazy Flapper 3.6", 130, BaitType.SILICON, "green", 0));

        return products;
    }

}
