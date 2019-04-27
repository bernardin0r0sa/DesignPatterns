package designpattern.state;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bernardinorosa on 27/04/19.
 */
public class Tesla {

    public static void main(String [] args){

        System.out.println("/////Customize Your Tesla Model 3///////");

        TeslaModel3CustomOrder teslaModel3 = new TeslaModel3CustomOrder();

        teslaModel3.selectTypeOfCar("Standard Range plus");
        teslaModel3.selectRims("18 inch"); // Will print - You didn't select the color
        teslaModel3.selectColor("Black");
        teslaModel3.selectRims("18 inch"); // Will Select the RIM, because you are in the correct order
        teslaModel3.selectInteriorColor("White");
        teslaModel3.selectAutoPilotFeature(true);

        System.out.println("/////Your customization is done ///////");
        System.out.println(teslaModel3.toString());



    }
}
