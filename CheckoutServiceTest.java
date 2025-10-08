import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class CheckoutServiceTest {

    @Test
    public void testCheckoutCallsCorrectProcessor() {
        PaymentProcessor mockProcessor = mock(PaymentProcessor.class);
        CheckoutService checkoutService = new CheckoutService();
        checkoutService.paymentProcessors.put(PaymentMode.PAYPAL, mockProcessor);

        checkoutService.checkout(PaymentMode.PAYPAL, 99.99);

        verify(mockProcessor, times(1)).processPayment(99.99);
    }

    @Test
    public void testUnknownPaymentMode() {
        CheckoutService checkoutService = new CheckoutService();
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        checkoutService.checkout(null, 50.00);

        String output = out.toString().trim();
        assert output.equals("Invalid payment mode selected!");
    }
}
