package ObserverDesignPattern;

public class Subscriber implements Observer{
    private final String name;
    Subscriber(String name){
        this.name = name;
    }
    @Override
    public void update(String title) {
        System.out.println("Hey "+name+" new video uploaded "+title);
    }
}
