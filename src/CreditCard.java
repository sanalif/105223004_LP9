public class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Processing Credit Card payment of " + amount + " in " + currency);
    }
}
