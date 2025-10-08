import java.util.EnumMap;
import java.util.Map;

public class CheckoutService {

    private final Map<PaymentMode, PaymentProcessor> paymentProcessors = new EnumMap<>(PaymentMode.class);

    public CheckoutService() {
        paymentProcessors.put(PaymentMode.PAYPAL, new PayPalPayment());
        paymentProcessors.put(PaymentMode.GOOGLEPAY, new GooglePayPayment());
        paymentProcessors.put(PaymentMode.CREDITCARD, new CreditCardPayment());
    }

    public void checkout(PaymentMode mode, double amount) {
        PaymentProcessor processor = paymentProcessors.get(mode);
        if (processor != null) {
            processor.processPayment(amount);
        } else {
            System.out.println("Invalid payment mode selected!");
        }
    }

    // Optional for registering custom processors (e.g., mock)
    public void registerProcessor(PaymentMode mode, PaymentProcessor processor) {
        paymentProcessors.put(mode, processor);
    }
}
