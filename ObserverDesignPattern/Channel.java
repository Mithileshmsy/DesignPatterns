package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    List<Observer> subscribers = new ArrayList<>();

    //method to add subscriber when any one subscribe this channel
    public void subscribe(Subscriber s){
        subscribers.add(s);
    }
    //upload method
    public void upload(String videoTitle){
        System.out.println(videoTitle+" uploaded!");
        //notify all subscribers
        for(Observer o : subscribers){
            o.update(videoTitle);
        }

    }

}
