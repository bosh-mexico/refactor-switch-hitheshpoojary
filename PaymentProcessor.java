public interface PaymentProcessor {
    void processPayment(double amount);
}

class PayPalPayment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + String.format("%.2f", amount));
    }
}


class GooglePayPayment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing GooglePay payment of $" + String.format("%.2f", amount));
       
    }
}

class CreditCardPayment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + String.format("%.2f", amount));
    }
}
