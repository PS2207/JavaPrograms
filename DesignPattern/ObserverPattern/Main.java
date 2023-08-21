package DesignPattern.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        // YoutubeChannel channel = new YoutubeChannel();
        // Subscriber pragya = new Subscriber();
        Subject channel = new YoutubeChannel();
        Observer pragya = new Subscriber("Pragya");
        Observer priya = new Subscriber("Priya");
        channel.subscribe(pragya);
        channel.subscribe(priya);
        channel.newVideoUploaded("Learn design pattern");
        channel.newVideoUploaded("Learn Java course");
    }
}
