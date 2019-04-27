package designpattern.state;

/**
 * Created by bernardinorosa on 27/04/19.
 */
public class RimsState implements State {
    TeslaModel3CustomOrder customOrder;
    State previousState;
    String characteristic;

    public RimsState(TeslaModel3CustomOrder customOrder, State previousState ) {
        this.customOrder = customOrder;
        this.previousState = previousState;
    }

    @Override
    public void selectTypeOfCar(String typeOfCar) {
        System.out.println("Already Selected");
    }

    @Override
    public void selectColor(String color) {
        System.out.println("Already Selected");
    }

    @Override
    public void selectRims(String rims) {
        characteristic=previousState.printCharacteristic() + "Rims='" + rims + '\'' + ""+ '\n';
        customOrder.setState(new InteriorColorState(customOrder,this));
    }

    @Override
    public void selectInteriorColor(String interiorColor) {
        System.out.println("You didn't select the rims");


    }

    @Override
    public void selectAutoPilotFeature(boolean autoPilotMode) {
        System.out.println("You didn't select the interior color");


    }

    @Override
    public void setOrder() {
        System.out.println("You didn't select autopilot mode");

    }

    @Override
    public void goBack() {
        customOrder.setState(previousState);
    }


    @Override
    public String printCharacteristic() {
        return characteristic;
    }
}
