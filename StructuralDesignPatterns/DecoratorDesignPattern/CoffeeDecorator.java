package StructuralDesignPatterns.DecoratorDesignPattern;

 public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }
}
