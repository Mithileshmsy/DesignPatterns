package BehavioralDesignPatterns.StrategyDesignPattern;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using UPI payment");
    }
}
