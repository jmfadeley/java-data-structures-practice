package patterns.observer.manual;

import lombok.Data;

@Data
public class Reader implements Subscription {
    private String news;

    public void update(Object news) {
        this.setNews((String) news);
    }
}
