package designpattern.decorator;

/**
 * Created by bernardinorosa on 15/04/19.
 */
public class BasicHamburger implements Hamburger {
    @Override
    public String describe() {
        return "Hamburger with cheese";
    }
}
