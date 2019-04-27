package designpattern.state;

/**
 * Created by bernardinorosa on 27/04/19.
 */
public class AutoPilotState implements State {
    TeslaModel3CustomOrder customOrder;
    State previousState;
    String characteristic;


    public AutoPilotState(TeslaModel3CustomOrder customOrder, State previousState ) {
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
        System.out.println("Already Selected");
    }

    @Override
    public void selectInteriorColor(String interiorColor) {
        System.out.println("Already Selected");

    }

    @Override
    public void selectAutoPilotFeature(boolean autoPilot) {
        characteristic=previousState.printCharacteristic() + "Autopilot ='" + autoPilot + '\'' + ""+ '\n';
        customOrder.setState(new OrderState(customOrder,this));

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
