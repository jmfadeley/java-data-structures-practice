package patterns.observer.pcl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lombok.Data;

@Data
public class PCLNewsChannel implements PropertyChangeListener {
    private static final String EVENT = "news";
    private String news;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equalsIgnoreCase(EVENT)) {
            this.setNews((String) evt.getNewValue());
        }
    }
}
