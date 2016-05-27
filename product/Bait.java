package kursovik.product;

/**
 * Created by Hamster4n.
 */
public class Bait extends Product {
    private EnumBaitType baitType;
    private String color;
    private int weight;

    public Bait() {
    }

    public Bait(int productID, String name, int price, EnumBaitType baitType, String color, int weight) {
        super(productID, name, price);
        this.baitType = baitType;
        this.color = color;
        this.weight = weight;
    }

    public EnumBaitType getBaitType() {
        return baitType;
    }

    public void setBaitType(EnumBaitType baitType) {
        this.baitType = baitType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bait{" +
                "baitType=" + baitType +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
