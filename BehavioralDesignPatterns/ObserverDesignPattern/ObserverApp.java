//The Observer pattern defines a one-to-many dependency.
// When one object (the Subject) changes state,
// all its dependents (Observers) are notified
// and updated automatically.
// This is the heart of "event-driven" programming.

package BehavioralDesignPatterns.ObserverDesignPattern;

public class ObserverApp {
    public static void main(String[] args) {
        Channel ch = new Channel();
        Subscriber s1 = new Subscriber("Abc");
        Subscriber s2 = new Subscriber("Def");
        Subscriber s3 = new Subscriber("Ghe");
        Subscriber s4 = new Subscriber("Ijk");

        ch.subscribe(s1);
        ch.subscribe(s2);
        ch.subscribe(s3);
        ch.subscribe(s4);

        //till here channel ch have 4 subscriber s1,s2,s3,s4

        //calling upload method
        ch.upload("New Video");

    }
}
