package kursovik.product;

/**
 * Created by Hamster4n.
 */
public class Bait extends Product {

    private String baitType;
    private String color;
    private int weight;
    private static final String category = "Bait";

    public Bait(String baitType, String color, int weight) {
        this.baitType = baitType;
        this.color = color;
        this.weight = weight;
    }

    public String getBaitType() {
        return baitType;
    }

    public void setBaitType(String baitType) {
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

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Bait{" +
                "baitType='" + baitType + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
