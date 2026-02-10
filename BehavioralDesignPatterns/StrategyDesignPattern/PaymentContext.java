package BehavioralDesignPatterns.StrategyDesignPattern;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    //method to call pay()
    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}
