package patterns.observer.observable;

import java.util.Observable;

import lombok.Getter;

@Getter
public class ONewsAgency extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
