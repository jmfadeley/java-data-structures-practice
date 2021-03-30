package patterns.observer.pcl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lombok.Data;

@Data
public class PCLNewsChannel implements PropertyChangeListener {
    private String news;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }
}
