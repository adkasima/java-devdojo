package academy.devdojo.maratonajava.javacore.Fstaticmodifiers.domain;

public class Car {
    private String name;
    private double maxSpeed;
    public static double limitSpeed = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("-----------");
        System.out.println("Name " + this.name);
        System.out.println("max speed " + this.maxSpeed);
        System.out.println("limit speed " + Car.limitSpeed);
    }

    public static void setLimitSpeed(double limitSpeed) {
        Car.limitSpeed = limitSpeed;

    }

    public static double getLimitSpeed() {
        return Car.limitSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
