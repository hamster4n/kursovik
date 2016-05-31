package kursovik.product;

/**
 * Created by Hamster4n.
 */
public class Bait extends Product {
    private BaitType baitType;
    private String color;
    private int weight;
    private final String category = "Bait";

    public Bait() {
    }

    public Bait(int productID, String name, int price, BaitType baitType, String color, int weight) {
        super(productID, name, price);
        this.baitType = baitType;
        this.color = color;
        this.weight = weight;
    }

    public BaitType getBaitType() {
        return baitType;
    }

    public void setBaitType(BaitType baitType) {
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
        return "Bait{" + "Name:"+ getName()+
                baitType + ", price = " + getPrice()+
                ", color - " + color + '\'' +
                ", weight - " + weight +
                '}'+'\n';
    }
}
