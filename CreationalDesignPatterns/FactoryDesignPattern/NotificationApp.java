//The Factory pattern provides an interface for creating objects
// but allows subclasses to alter the type of objects
// that will be created.
//It hides the logic of instantiation from the user.
package CreationalDesignPatterns.FactoryDesignPattern;

public class NotificationApp {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("Email");
        notification.notifyUser();
        Notification notification1 = NotificationFactory.createNotification("SMS");
        notification1.notifyUser();
    }
}
