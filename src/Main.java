public class Main {
    public static void main(String[] args) {
        // Polymorphic array
        PaymentMethod[] methods = {
            new CreditCard(),
            new EWallet(),
            new BankTransfer()
        };

        // overriding
        System.out.println("=== Pembayaran Default ===");
        for (PaymentMethod method : methods) {
            method.processPayment(500_000); 
        }

        // overloading
        System.out.println("\n=== Pembayaran dengan Mata Uang ===");
        for (PaymentMethod method : methods) {
            method.processPayment(100.0, "USD");
        }
    }
}
