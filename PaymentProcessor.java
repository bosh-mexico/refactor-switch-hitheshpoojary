
public interface PaymentProcessor {
    void processPayment(double amount);
}


class PayPalPayment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + String.format("%.2f", amount));
        // TODO: Integrate with real PayPal API in the future
    }
}

class GooglePayPayment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing GooglePay payment of $" + String.format("%.2f", amount));
        // TODO: Integrate with real Google Pay API in the future
    }
}

class CreditCardPayment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + String.format("%.2f", amount));
        // TODO: Integrate with real Credit Card API in the future
    }
}
