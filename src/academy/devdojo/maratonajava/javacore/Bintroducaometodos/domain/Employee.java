package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Employee {
    public String name;
    public int age;
    public double[] wages;

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


}
