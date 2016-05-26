package kursovik.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hamster4n.
 */
public class Rod extends Product{
    private String rodType;
    private int castingMin;
    private int castingMax;
    private static final String category = "Rod";

    public Rod() {
    }

    public Rod(int productID, String name, int price, String rodType, int castingMin, int castingMax) {
        super(productID, name, price);
        this.rodType = rodType;
        this.castingMin = castingMin;
        this.castingMax = castingMax;
    }


    public String getRodType() {
        return rodType;
    }

    public void setRodType(String rodType) {
        this.rodType = rodType;
    }

    public int getCastingMin() {
        return castingMin;
    }

    public void setCastingMin(int castingMin) {
        this.castingMin = castingMin;
    }

    public int getCastingMax() {
        return castingMax;
    }

    public void setCastingMax(int castingMax) {
        this.castingMax = castingMax;
    }

    public String getCategory() {
        return category;
    }

}
