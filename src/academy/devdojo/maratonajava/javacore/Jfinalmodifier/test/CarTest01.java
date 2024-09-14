package academy.devdojo.maratonajava.javacore.Jfinalmodifier.test;

import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Car;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.OWNER);
        car.OWNER.setName("Bob");
        System.out.println(car.OWNER);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("La Ferrari");
        ferrari.print();
    }
}
