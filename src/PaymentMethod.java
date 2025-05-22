public class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing generic payment of " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Processing generic payment of " + amount + " " + currency);
    }
}
