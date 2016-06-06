package kursovik.utils;

import kursovik.product.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hamster4n.
 */
public class ProductIOUtils {
    public static final String CSV_DELIMETR = ";";


    private ProductIOUtils() {
    }

    ////чтение продуктов из символьного файла в лист


    //открываем файл и передаём на метод чтения строк
    public static Product readProductFromFile(String FILE_NAME) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            return readProduct(reader);
        }
    }

    //чтение одной строки из символьного файла и передаём на расшифровку csv в наш вид
    private static Product readProduct(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return parseProductFromCsv(line);
    }

    // открываем файл и передаём на метод чтения ВСЕХ строк
    public static List<Product> readProductsFromFile(String FILE_NAME) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            return readProducts(reader);
        }
    }

    //чтение всех строк из символьного файла
    public static List<Product> readProducts(BufferedReader reader) throws IOException {
        List<Product> products = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            Product product = parseProductFromCsv(line);
            if (product != null) {
                products.add(product);
            }
        }
        return products;
    }

    //преобразование из csv в Product

    public static Product parseProductFromCsv(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        String[] tokens = s.split(CSV_DELIMETR);
        String typeProduct = tokens[0];

        switch (typeProduct) {
            case "rod":
                int productID = Integer.parseInt(tokens[1]);
                String name = tokens[2];
                int price = Integer.parseInt(tokens[3]);
                RodType rodType = RodType.valueOf(tokens[4]);
                int kastingMin = Integer.parseInt(tokens[5]);
                int kastingMax = Integer.parseInt(tokens[6]);
                return new Rod(productID, name, price, rodType, kastingMin, kastingMax);
            case "coil":
                int productIDCoil = Integer.parseInt(tokens[1]);
                String nameCoil = tokens[2];
                int priceCoil = Integer.parseInt(tokens[3]);
                CoilType coilType = CoilType.valueOf(tokens[4]);
                int numberOfBearings = Integer.parseInt(tokens[5]);
                boolean isSecondSpoolHas = Boolean.valueOf(tokens[6]);
                return new Coil(productIDCoil, nameCoil, priceCoil, coilType, numberOfBearings, isSecondSpoolHas);
            case "bait":
                int productIDBait = Integer.parseInt(tokens[1]);
                String nameBait = tokens[2];
                int priceBait = Integer.parseInt(tokens[3]);
                BaitType baitType = BaitType.valueOf(tokens[4]);
                String color = tokens[5];
                int weight = Integer.parseInt(tokens[6]);
                return new Bait(productIDBait, nameBait, priceBait, baitType, color, weight);
            default:
                return null;
        }
    }

    //преобразование из Product в csv
    public static String convertProductToCsv(Product product) {
        //объектов Product не существует. есть только Rod, Coil и Bait. А как же их сюда запихнуть в общем виде?
        if (product instanceof Rod) {
            return "rod" + CSV_DELIMETR + product.getProductID() + CSV_DELIMETR + product.getName() + CSV_DELIMETR +
                    product.getPrice() + CSV_DELIMETR + ((Rod) product).getRodType() + CSV_DELIMETR +
                    ((Rod) product).getCastingMin() + CSV_DELIMETR + ((Rod) product).getCastingMax();
        }
        if (product instanceof Coil){
            return "coil" + CSV_DELIMETR + product.getProductID() + CSV_DELIMETR + product.getName() + CSV_DELIMETR +
                    product.getPrice() + CSV_DELIMETR + ((Coil) product).getCoilType() + CSV_DELIMETR +
                    ((Coil) product).getNumberOfBearings() + CSV_DELIMETR + ((Coil) product).getIsSecondSpoolHas();
        }
        if (product instanceof Bait){
            return "bait" + CSV_DELIMETR + product.getProductID() + CSV_DELIMETR + product.getName() + CSV_DELIMETR +
                    product.getPrice() + CSV_DELIMETR + ((Bait) product).getBaitType() + CSV_DELIMETR +
                    ((Bait) product).getColor() + CSV_DELIMETR + ((Bait) product).getWeight();
        }
        return "ups!";
    }

    //проверка значения на принадлежность к int
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    ///// запись в файл csv
    // создаём файл и передаём на заполнение одной строкой product
    public static void outputProductIntoFile(Product product, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            outputProduct(product, writer);
        }
    }

    // создаём файл и передаём на заполнение множеством строк products
    public static void outputProductsIntoFile(List<Product> products, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            outputProducts(products, writer);
        }
    }

    // заполнение файла одним product в строку csv
    public static void outputProduct(Product product, PrintWriter writer) {
        writer.println(convertProductToCsv(product));
    }

    // заполнение файла списком products в файл csv
    public static void outputProducts(List<Product> products, PrintWriter writer) {
        for (Product product : products) {
            outputProduct(product, writer);
        }
    }

    ////// запись в бинарный файл
    public static void outputBinaryProductsIntoFile(List<Product> products, String fileName) throws IOException {
        try (ObjectOutput outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            outputStream.writeObject(products);
        }
    }

    ///// чтение из бинарного файла
    public static List<Product> readBinaryProductsFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInput objectInput = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Product>) objectInput.readObject();
        }
    }



}
