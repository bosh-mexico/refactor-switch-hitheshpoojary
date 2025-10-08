public class CheckoutApp {
    public static void main(String[] args) {
        CheckoutService checkout = new CheckoutService();
        double amount = 150.75;

        checkout.checkout(PaymentMode.PAYPAL, amount);
        checkout.checkout(PaymentMode.GOOGLEPAY, amount);
        checkout.checkout(PaymentMode.CREDITCARD, amount);
        checkout.checkout(null, amount);  
    }
}
