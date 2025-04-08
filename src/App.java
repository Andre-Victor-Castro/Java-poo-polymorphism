public class App {
    public static void main(String[] args) throws Exception {
        // Usage with interfaces and abstract classes.
        IPayment creditCard = new CreditCard("1234-5678-9012-3456", "Cleusa", "2024-12-31", "123");
        IPayment bankSlip = new BankSlip("123456789012", "2023-12-31", 150.00);

        System.out.println("\n ---- Credit Card ---- \n");
        creditCard.process(); // Override
        ((CreditCard) creditCard).process(); // Overload
        ((CreditCard) creditCard).process(3); // Overload  

        System.out.println("\n ---- Bank Slip ---- \n");
        bankSlip.process(); // Override
        ((BankSlip) bankSlip).process(20.00); // Overload
        ((BankSlip) bankSlip).process("Early payment", 130.00); // Overload

        // Correct application in real-world projects.
        IPayment[] payments = {creditCard, bankSlip};
        for (IPayment payment : payments) {
            payment.process(); // Polymorphism
        }

        System.out.println(" \n");
    }
}