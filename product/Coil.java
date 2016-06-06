package kursovik.product;

import java.io.Serializable;

/**
 * Created by Hamster4n.
 */
public class Coil extends Product implements Serializable{
    private CoilType coilType;
    private int numberOfBearings;
    private boolean isSecondSpoolHas;
    private final String category = "Coil";

    public Coil() {
    }

    public Coil(int productID, String name, int price, CoilType coilType, int numberOfBearings, boolean isSecondSpoolHas) {
        super(productID, name, price);
        this.coilType = coilType;
        this.numberOfBearings = numberOfBearings;
        this.isSecondSpoolHas = isSecondSpoolHas;
    }

    public CoilType getCoilType() {
        return coilType;
    }

    public void setCoilType(CoilType coilType) {
        this.coilType = coilType;
    }

    public int getNumberOfBearings() {
        return numberOfBearings;
    }

    public void setNumberOfBearings(int numberOfBearings) {
        this.numberOfBearings = numberOfBearings;
    }

    public boolean getIsSecondSpoolHas() {
        return isSecondSpoolHas;
    }

    public void setSecondSpoolHas(boolean secondSpoolHas) {
        isSecondSpoolHas = secondSpoolHas;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Coil{" + "Name: " + getName()+
                coilType + ", price = " + getPrice()+
                ", number of bearings - " + numberOfBearings +
                ", has second spool: " + isSecondSpoolHas +
                '}'+'\n';
    }


}
