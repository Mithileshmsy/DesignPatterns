//The Strategy Pattern allows you to define a family of algorithms,
// put each of them into a separate class,
// and make their objects interchangeable.
// This avoids messy if-else or switch blocks
// that grow every time you add a new feature.

package BehavioralDesignPatterns.StrategyDesignPattern;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentContext px = new PaymentContext();
        //setting strategy for credit card
        px.setPaymentStrategy(new CreditCardPayment());
        px.checkout(1000);
        //setting strategy for upi
        px.setPaymentStrategy(new UPIPayment());
        px.checkout(1000);
    }
}
