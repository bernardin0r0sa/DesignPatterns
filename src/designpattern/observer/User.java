package designpattern.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by bernardinorosa on 06/04/19.
 */
public class User implements PropertyChangeListener {

    private boolean amazingHatInStock=false;

    public void propertyChange(PropertyChangeEvent changeEvent) {
        this.updateAmazingHatInStockStatus((boolean) changeEvent.getNewValue());
    }

    private void updateAmazingHatInStockStatus(boolean newValue) {
        setAmazingHatInStock(newValue);
        if(amazingHatInStock) {buyAmazingHat();}
    }


    public void setAmazingHatInStock(boolean amazingHatInStock) {
        this.amazingHatInStock = amazingHatInStock;
    }

    private void buyAmazingHat() {
        System.out.println("Taking the Amazing Hat Home");
    }

}