package kursovik.customer;

/**
 * Created by Hamster4n.
 */
public class Customer {
    private int customerID;
    private String customerName;
    private String customerAdress;
    private String customerPhone;

    public Customer(int customerID, String customerName, String customerAdress, String customerPhone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAdress = customerAdress;
        this.customerPhone = customerPhone;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", customerAdress='" + customerAdress + '\'' +
                ", customerPhone=" + customerPhone +
                '}';
    }
}
