package kursovik.product;

/**
 * Created by Hamster4n.
 */
public class Coil extends Product{
    private EnumCoilType coilType;
    private int numberOfBearings;
    private boolean isSecondSpoolHave;

    public Coil() {
    }

    public Coil(int productID, String name, int price, EnumCoilType coilType, int numberOfBearings, boolean isSecondSpoolHave) {
        super(productID, name, price);
        this.coilType = coilType;
        this.numberOfBearings = numberOfBearings;
        this.isSecondSpoolHave = isSecondSpoolHave;
    }

    public EnumCoilType getCoilType() {
        return coilType;
    }

    public void setCoilType(EnumCoilType coilType) {
        this.coilType = coilType;
    }

    public int getNumberOfBearings() {
        return numberOfBearings;
    }

    public void setNumberOfBearings(int numberOfBearings) {
        this.numberOfBearings = numberOfBearings;
    }

    public boolean isSecondSpoolHave() {
        return isSecondSpoolHave;
    }

    public void setSecondSpoolHave(boolean secondSpoolHave) {
        isSecondSpoolHave = secondSpoolHave;
    }

    @Override
    public String toString() {
        return "Coil{" +
                "coilType=" + coilType +
                ", numberOfBearings=" + numberOfBearings +
                ", isSecondSpoolHave=" + isSecondSpoolHave +
                '}';
    }
}
