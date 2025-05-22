public class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing E-Wallet payment of " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Processing E-Wallet payment of " + amount + " in " + currency);
    }
}
