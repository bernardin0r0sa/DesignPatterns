package designpattern.state;

/**
 * Created by bernardinorosa on 26/04/19.
 */
public class TeslaModel3CustomOrder {

    private State state;

    public TeslaModel3CustomOrder() {
        this.state = new TypeOfCarState(this);
    }

    public void goBackState(){
        state.goBack();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void selectColor(String color) {
        state.selectColor(color);
    }

    public void selectTypeOfCar(String typeOfCar) {
        state.selectTypeOfCar(typeOfCar);
    }

    public void selectRims(String rims) {
        state.selectRims(rims);
    }

    public void selectInteriorColor(String interiorColor) {
        state.selectInteriorColor(interiorColor);
    }

    public void selectAutoPilotFeature(boolean autoPilot) {
        state.selectAutoPilotFeature(autoPilot);
    }

    public void setOrder() {
        state.setOrder();
    }

    @Override
    public String toString() {
        return state.printCharacteristic();
    }
}
