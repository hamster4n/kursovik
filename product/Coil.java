package kursovik.product;

/**
 * Created by Hamster4n.
 */
public class Coil extends Product {

    private String coilType;
    private int numberOfBearings;
    private boolean isSecondSpoolHas;
    private static final String category = "Coil";

    public Coil(String coilType, int numberOfBearings, Boolean isSecondSpoolHas) {
        this.coilType = coilType;
        this.numberOfBearings = numberOfBearings;
        this.isSecondSpoolHas = isSecondSpoolHas;
    }

    public String getCoilType() {
        return coilType;
    }

    public void setCoilType(String coilType) {
        this.coilType = coilType;
    }

    public int getNumberOfBearings() {
        return numberOfBearings;
    }

    public void setNumberOfBearings(int numberOfBearings) {
        this.numberOfBearings = numberOfBearings;
    }

    public Boolean getIsSecondSpoolHas() {
        return isSecondSpoolHas;
    }

    public void setSecondSpoolHave(Boolean secondSpoolHave) {
        isSecondSpoolHas = secondSpoolHave;
    }

    public  String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Coil{" +
                "coilType='" + coilType + '\'' +
                ", numberOfBearings=" + numberOfBearings +
                ", isSecondSpoolHave=" + isSecondSpoolHas +
                '}';
    }
}
