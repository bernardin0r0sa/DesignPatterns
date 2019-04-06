package designpattern.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by bernardinorosa on 06/04/19.
 */
public class AmazingHat {
    private boolean inStock;

    private PropertyChangeSupport propertyChangeSupport;

    public AmazingHat() {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addListener(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
    }

    public void removeListener(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.removePropertyChangeListener(propertyChangeListener);
    }

    public void setInStock(boolean value) {
        propertyChangeSupport.firePropertyChange("inStock", this.inStock, value);
        this.inStock = value;
    }
}
