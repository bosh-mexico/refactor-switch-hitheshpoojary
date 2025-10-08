public class CheckoutApp {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService();
        double amount = 150.75;

        checkoutService.checkout(PaymentMode.PAYPAL, amount);
        checkoutService.checkout(PaymentMode.GOOGLEPAY, amount);
        checkoutService.checkout(PaymentMode.CREDITCARD, amount);
        checkoutService.checkout(null, amount);
    }
}
