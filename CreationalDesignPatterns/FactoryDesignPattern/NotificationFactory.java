package CreationalDesignPatterns.FactoryDesignPattern;

public class NotificationFactory {
    public static Notification createNotification(String type){
        if(type.equals("Email")) return new EmailNotification();
        if(type.equals("SMS")) return new SMSNotification();
        return null;
    }
}
