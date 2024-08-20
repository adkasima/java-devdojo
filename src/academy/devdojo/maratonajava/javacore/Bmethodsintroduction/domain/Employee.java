package academy.devdojo.maratonajava.javacore.Bmethodsintroduction.domain;

public class Employee {
    private String name;
    private int age;
    private double[] wages;

    public void print(Employee employee) {
        if(name == null || age == 0 || wages == null) {
            return;
        }

        System.out.println(employee.name);
        System.out.println(employee.age);
        for (double wage: employee.wages) {
            System.out.println(wage);
        }
        wagesAverage();

    }

    public void wagesAverage() {
        if(name == null || age == 0 || wages == null) {
            return;
        }
        double average = 0;
        for (double wage: this.wages) {
            average += wage;
        }
        average /= this.wages.length;
        System.out.println("Waves average: " + average);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getWages() {
        return wages;
    }

    public void setWages(double[] wages) {
        this.wages = wages;
    }
}
