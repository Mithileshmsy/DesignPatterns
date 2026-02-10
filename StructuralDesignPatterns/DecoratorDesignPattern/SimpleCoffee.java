package StructuralDesignPatterns.DecoratorDesignPattern;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
