package kursovik.product;

/**
 * Created by Hamster4n.
 */
public enum RodType {
    SPINNING("Spinning"),
    FEEDER("feeder"),
    FISHING_ROD("Fishing rod");

    private final String rodType;

    RodType(String rodType) {
        this.rodType = rodType;
    }

    @Override
    public String toString() {
        return ", rodType - " + rodType;
    }
}
