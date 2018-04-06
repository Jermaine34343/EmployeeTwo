package basedemployee;

public class Invoice extends Employee implements IPayAble {

  private String PartNumber;
  private String PartDescription;
  private int Quantity;
  private double PricePerItem;


    public Invoice(String firstName, String lastName, String socialSecurityNumber, String partNumber, String partDescription, int quantity, double pricePerItem) {
        super(firstName, lastName, socialSecurityNumber);
        PartNumber = partNumber;
        PartDescription = partDescription;
        Quantity = quantity;
        PricePerItem = pricePerItem;
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

    @Override
    public double GetPaymentAmount() {
        return 0;
    }

    @Override
    public double earningMethod() {
        return 0;
    }
}
