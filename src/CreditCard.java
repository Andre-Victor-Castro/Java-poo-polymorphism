// Usage with interfaces and abstract classes.
public class CreditCard implements IPayment {
    private String cardNumber;
    private String cardholderName;
    private String expirationDate;
    private String securityCode;

    public CreditCard(String cardNumber, String cardholderName, String expirationDate, String securityCode) {
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
    }

    @Override
    public void process() {
        System.out.println("Processing payment with credit card...");
        // Logic to process payment with credit card
    }

    // Overloading: methods with the same name but different signatures
    public void process(double installments) {
        System.out.println("Processing payment with credit card in " + installments + " installments.");
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }
}
