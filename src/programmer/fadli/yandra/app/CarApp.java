package programmer.fadli.yandra.app;

import programmer.fadli.yandra.data.Avanza;
import programmer.fadli.yandra.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();


    }

}
