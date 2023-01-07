package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Observable {
    private String channelName;
    private List<Subscriber> subscribers;

    public Channel(String name) {
        this.subscribers = new ArrayList<>();
        this.channelName = name;
    }
    @Override
    public void subscribeChannel(Subscriber s){
        subscribers.add(s);
    }
    @Override
    public void uploadVideo(String title){
        System.out.println("video uploaded: " + title);
        notifySubscribers();
    }
    @Override
    public void notifySubscribers(){
        for(Subscriber sub: subscribers){
            sub.update();
        }
    }
}
