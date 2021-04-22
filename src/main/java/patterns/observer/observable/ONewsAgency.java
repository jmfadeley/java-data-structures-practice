package patterns.observer.observable;

import java.util.Observable;

import lombok.Getter;


/**
 * No interface needed. Although cool, java.util.Observable has been deprecated because of
 * an inability to identify the Observer.
 * @param news
 */
@Getter
public class ONewsAgency extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
