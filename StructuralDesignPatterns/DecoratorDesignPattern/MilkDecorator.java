package StructuralDesignPatterns.DecoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription(){
        return decoratedCoffee.getDescription() + ",Milk";
    }

    public double getPrice(){
        return decoratedCoffee.getPrice()+1.5;
    }

}
