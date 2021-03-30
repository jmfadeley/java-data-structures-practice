package patterns.observer.observable;

import java.util.Observable;
import java.util.Observer;

import lombok.Data;

@Data
public class ONewsChannel implements Observer {
    private String news;

    @Override
    public void update(Observable o, Object news) {
        this.setNews((String)news);
    }
}
