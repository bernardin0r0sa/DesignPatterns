package designpattern.factory;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Created by bernardinorosa on 27/04/19.
 */
public class CarMain {

    public static void main(String[] args) {
        Supplier<CarFactory> carFactory =  CarFactory::new;

        Car car1 =carFactory.get().getCar("ferrari");
        Car car2 =carFactory.get().getCar("lamborghini");

        Arrays.asList(car1.carBrand(),car2.carBrand()).forEach(System.out::println);

    }
}
