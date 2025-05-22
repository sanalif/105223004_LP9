public class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bank Transfer payment of " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Processing Bank Transfer payment of " + amount + " in " + currency);
    }
}
