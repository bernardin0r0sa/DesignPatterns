package designpattern.observer;

/**
 * Created by bernardinorosa on 06/04/19.
 */
public class HatStore {

    public static void main(String[]args) {
        AmazingHat observable = new AmazingHat();
        User observer = new User();

        observable.addListener(observer);
        observable.setInStock(true);

        observable.removeListener(observer);
    }
}
