package CreationalDesignPatterns.SingletonDesignPattern;

public class Application {
    public static void main(String[] args) {
        DatabaseConfig instance = DatabaseConfig.getInstance();
        DatabaseConfig instance1 = DatabaseConfig.getInstance();

        System.out.println(instance.equals(instance1));

    }
}
