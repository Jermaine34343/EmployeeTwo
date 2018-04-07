package basedemployee;

public class Invoice implements IPayAble {

    private String PartNumber;
    private String PartDescription;
    private int Quantity;
    private double PricePerItem;


    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.PartNumber = partNumber;
        this.PartDescription = partDescription;
        this.Quantity = quantity;
        this.PricePerItem = pricePerItem;
    }


    public String getPartNumber() {
        return PartNumber;
    }

    public void setPartNumber(String partNumber) {
        PartNumber = partNumber;
    }

    public String getPartDescription() {
        return PartDescription;
    }

    public void setPartDescription(String partDescription) {
        PartDescription = partDescription;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getPricePerItem() {
        return PricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        PricePerItem = pricePerItem;
    }



    public double GetPaymentAmount() {
        return getQuantity() + getPricePerItem();
    }
}

