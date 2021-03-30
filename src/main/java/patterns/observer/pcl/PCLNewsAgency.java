package patterns.observer.pcl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import lombok.Getter;

@Getter
public class PCLNewsAgency {
    private String news;

    private PropertyChangeSupport support;
    
    public PCLNewsAgency() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) { 
        support.addPropertyChangeListener(pcl); // Give it a pickle!
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl); // My pickle! :o
    }

    public void setNews(String value) {
        support.firePropertyChange("news", this.news, value);
        this.news = value;
    }
}
