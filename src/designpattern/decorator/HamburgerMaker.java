package designpattern.decorator;

/**
 * Created by bernardinorosa on 15/04/19.
 */
public class HamburgerMaker {

    public static void main(String [] args) {

        BasicHamburger hamburger = new BasicHamburger();

        Hamburger doubleCheese = () -> hamburger.describe() + " with extra cheese ";

        Hamburger baconBurguer = () -> hamburger.describe() + " with bacon ";

        Hamburger baconDoubleCheese = () -> doubleCheese.describe() + " with bacon ";

        System.out.println("BaconDoubleCheese is a :" +baconDoubleCheese.describe());
    }
}
