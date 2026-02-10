package StructuralDesignPatterns.ProxyDesignPattern;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet{
    private RealInternet realInternet;

    public ProxyInternet() {
        this.realInternet = new RealInternet();
    }
    //create list of banned site for access control
    public static List<String> bannedSites = Arrays.asList("social.com","video.com","game.com");

    @Override
    public void connectTo(String host) {
        if (!bannedSites.contains(host)){
            realInternet.connectTo(host);
        }
        else {
            System.out.println("Sorry we can't connect");
        }
    }
}
