package academy.devdojo.maratonajava.javacore.Fstaticmodifiers.test;

import academy.devdojo.maratonajava.javacore.Fstaticmodifiers.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car.setLimitSpeed(180);
        Car car01 = new Car("BMW", 280);
        Car car02 = new Car("Mercedes Benz", 290);
        Car car03 = new Car("Ferrari", 320);


        car01.print();
        car02.print();
        car03.print();
    }
}
