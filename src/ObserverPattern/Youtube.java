package ObserverPattern;

public class Youtube {
    public static void main(String[] args) {
        Channel channel = new Channel("code with consistency");

        Subscriber s1 = new Subscriber("ali");
        Subscriber s2 = new Subscriber("ahmad");
        Subscriber s3 = new Subscriber("hassan");
        Subscriber s4 = new Subscriber("haris");

        channel.subscribeChannel(s1);
        channel.subscribeChannel(s2);
        channel.subscribeChannel(s3);
        channel.subscribeChannel(s4);

        channel.uploadVideo("First program in c++");
    }
}
