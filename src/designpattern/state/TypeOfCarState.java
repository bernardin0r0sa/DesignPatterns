package designpattern.state;

/**
 * Created by bernardinorosa on 26/04/19.
 */
public class TypeOfCarState implements State {

    TeslaModel3CustomOrder customOrder;
    String characteristic;

    public TypeOfCarState(TeslaModel3CustomOrder customOrder) {
        this.customOrder = customOrder;
    }

    @Override
    public void selectTypeOfCar(String typeOfCar) {
        characteristic = "Type of car='" + typeOfCar + '\'' + "" + '\n';
        customOrder.setState(new ColorState(customOrder,this));
    }

    @Override
    public void selectColor(String color) {
        System.out.println("You didn't select the type of car");

    }

    @Override
    public void selectRims(String rims) {
        System.out.println("You didn't select the color");


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
    public String printCharacteristic() {
        return characteristic;
    }


    @Override
    public void setOrder() {
        System.out.println("You didn't select autopilot mode");


    }

    @Override
    public void goBack() {
        System.out.println("You are in the root state");

    }
}
