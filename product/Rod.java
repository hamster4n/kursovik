package kursovik.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hamster4n.
 */
public class Rod extends Product{
    private String rodType;
    private int kastingMin;
    private int kastingMax;

    public Rod() {
    }

    public Rod(int productID, String name, int price, String rodType, int kastingMin, int kastingMax) {
        super(productID, name, price);
        this.rodType = rodType;
        this.kastingMin = kastingMin;
        this.kastingMax = kastingMax;
    }


    public String getRodType() {
        return rodType;
    }

    public void setRodType(String rodType) {
        this.rodType = rodType;
    }

    public int getKastingMin() {
        return kastingMin;
    }

    public void setKastingMin(int kastingMin) {
        this.kastingMin = kastingMin;
    }

    public int getKastingMax() {
        return kastingMax;
    }

    public void setKastingMax(int kastingMax) {
        this.kastingMax = kastingMax;
    }

    @Override
    public  List<Product> findByType(List<Product> products, String type) {
        List<Product> results = new ArrayList<>();

        //тут реализация метода
        System.out.println("сработал метод класса Rod");
        return results;
    }
}
