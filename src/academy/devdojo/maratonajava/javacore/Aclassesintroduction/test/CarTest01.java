package academy.devdojo.maratonajava.javacore.Aclassesintroduction.test;

import academy.devdojo.maratonajava.javacore.Aclassesintroduction.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Sandero";
        car1.model = "Hatch";
        car1.year = 2014;

        car2.name = "Ford Fiesta";
        car2.model = "Hatch";
        car2.year = 2016;

        System.out.println("Car 1");
        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println("Car 2");
        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}
