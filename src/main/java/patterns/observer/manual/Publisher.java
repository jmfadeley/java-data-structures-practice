package patterns.observer.manual;

import java.util.ArrayList;
import java.util.List;

// Instead of 
public class Publisher {
    private String news;
    private List<Subscription> subscriptions = new ArrayList<>();

    public void addObserver(Subscription subscriber) {
        this.subscriptions.add(subscriber);
    }

    public void removeObserver(Subscription subscriber) {
        this.subscriptions.remove(subscriber);
    }

    public String getNews() {
        return this.news;
    }

    public void setNews(String news) {
        this.news = news;
        for(Subscription subscriber : this.subscriptions) {
            subscriber.update(this.news);
        }
    }
}
