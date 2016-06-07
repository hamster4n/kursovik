package kursovik.product;

/**
 * Created by Hamster4n.
 */
public enum BaitType {
    WOBBLER ("Wobbler"),
    SPOON ("Spoon"),
    SILICON ("Silicon");

    private final String baitType;

    BaitType(String baitType){
    this.baitType = baitType;
}

    public String getBaitType() {
        return baitType;
    }

    @Override
    public String toString() {
        return baitType;
    }
}
