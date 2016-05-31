package kursovik.product;


/**
 * Created by Hamster4n.
 */
public class Rod extends Product{
    private RodType rodType;
    private int castingMin;
    private int castingMax;
    private final String category = "Rod";

    public Rod() {
    }

    public Rod(int productID, String name, int price, RodType rodType, int kastingMin, int kastingMax) {
        super(productID, name, price);
        this.rodType = rodType;
        this.castingMin = kastingMin;
        this.castingMax = kastingMax;
    }

    public RodType getRodType() {
        return rodType;
    }

    public void setRodType(RodType rodType) {
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

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Rod{" +" Name: "+ getName()+
                rodType + ", price = "+ getPrice()+
                ", castingMin - " + castingMin +
                ", castingMax - " + castingMax +
                '}'+'\n';
    }
}
