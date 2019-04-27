package designpattern.state;

/**
 * Created by bernardinorosa on 27/04/19.
 */
public class OrderState implements State{
    TeslaModel3CustomOrder customOrder;
    State previousState;
    String characteristic;

    public OrderState(TeslaModel3CustomOrder customOrder, State previousState ) {
        this.customOrder = customOrder;
        this.previousState = previousState;
        setOrder();
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
    public void selectAutoPilotFeature(boolean autoPilotMode) {
        System.out.println("Already Selected");


    }

    @Override
    public void setOrder() {
        characteristic=previousState.printCharacteristic() + "Customization Complete - Model Ordered"+'\n';
        //System.out.println("What:"+characteristic);

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
