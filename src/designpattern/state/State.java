package designpattern.state;

/**
 * Created by bernardinorosa on 26/04/19.
 */
public interface State {

    public void selectTypeOfCar(String typeOfCar);
    public void selectColor(String color);
    public void selectRims(String rims);
    public void selectInteriorColor(String interiorColor);
    public void selectAutoPilotFeature(boolean autoPilotMode);
    public String printCharacteristic();
    public void setOrder();
    public void goBack();
}
