package kursovik.product;


/**
 * Created by Hamster4n.
 */
public class Rod extends Product{
    private EnumRodType rodType;
    private int kastingMin;
    private int kastingMax;

    public Rod() {
    }

    public Rod(int productID, String name, int price, EnumRodType rodType, int kastingMin, int kastingMax) {
        super(productID, name, price);
        this.rodType = rodType;
        this.kastingMin = kastingMin;
        this.kastingMax = kastingMax;
    }

    public EnumRodType getRodType() {
        return rodType;
    }

    public void setRodType(EnumRodType rodType) {
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
    public String toString() {
        return "Rod{" +
                "rodType=" + rodType +
                ", kastingMin=" + kastingMin +
                ", kastingMax=" + kastingMax +
                '}';
    }
}
