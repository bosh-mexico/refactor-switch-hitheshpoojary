public interface PaymentProcessor {
    void process(double amount);
    PaymentMode getMode();
}
