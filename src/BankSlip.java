// Usage with interfaces and abstract classes.
public class BankSlip implements IPayment {
    private String barcode;
    private String dueDate;
    private double amount;

    public BankSlip(String barcode, String dueDate, double amount) {
        this.barcode = barcode;
        this.dueDate = dueDate;
        this.amount = amount;
    }

    @Override
    public void process() {
        System.out.println("Processing payment with bank slip...");
        // Logic to process payment with bank slip
    }

    // Overloading: methods with the same name but different signatures
    public void process(double discount) {
        System.out.println("Processing payment with bank slip with a discount of R$ " + discount);
    }

    public void process(String message, double amount) {
        System.out.println("Processing bank slip: " + message + " with the amount of R$ " + amount);
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}