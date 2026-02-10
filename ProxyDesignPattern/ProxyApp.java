//The Proxy Pattern is a Structural pattern that provides
// a placeholder or "substitute" for another object.
// A proxy controls access to the original object,
// allowing you to perform something
// either before or after the request reaches the original object.

package ProxyDesignPattern;

public class ProxyApp {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("search.com");
        internet.connectTo("game.com");

    }

}
