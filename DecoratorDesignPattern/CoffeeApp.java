package DecoratorDesignPattern;

public class CoffeeApp {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        simpleCoffee = new MilkDecorator(simpleCoffee);
        simpleCoffee = new SugarDecorator(simpleCoffee);

        System.out.println(simpleCoffee.getDescription());
        System.out.println(simpleCoffee.getPrice());
    }
}
