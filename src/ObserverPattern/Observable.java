package ObserverPattern;

public interface Observable {
    void subscribeChannel(Subscriber s);

    void uploadVideo(String title);

    void notifySubscribers();
}
