package DesignPattern.ObserverPattern;

public interface Subject {
    // it has 3 youtubeChannel methods
    // subscribe, unsubscribe, send notification methods
    void subscribe(Observer ob);

    void unSubscribe(Observer ob);

    void newVideoUploaded(String title);
}
