package DecoratorDesignPattern;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }


    public String getDescription() {
        return decoratedCoffee.getDescription()+ ",Sugar";
    }


    public double getPrice() {
        return decoratedCoffee.getPrice() + 0.5;
    }
}
