package designpattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Created by bernardinorosa on 27/04/19.
 */
public class CarFactory {

    final static Map<String, Supplier<Car>> map = new HashMap<>();
    static {
        map.put("FERRARI", Ferrari::new);
        map.put("LAMBORGHINI", Lamborghini::new);
    }
    public Car getCar(String carBrand){
        Supplier<Car> car = map.get(carBrand.toUpperCase());
        if(car != null) {
            return car.get();
        }
        throw new IllegalArgumentException("The  " + carBrand.toUpperCase() + " car brand doesn't exist");
    }
}
