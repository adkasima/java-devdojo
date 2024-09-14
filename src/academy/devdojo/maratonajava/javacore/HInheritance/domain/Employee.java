package academy.devdojo.maratonajava.javacore.HInheritance.domain;

public class Employee extends Person {
    private double salary;

    static {
        System.out.println("on Employee static initialization block");
    }

    {
        System.out.println("on Employee initialization block 1");
    }

    {
        System.out.println("on Employee initialization block 2");
    }

    public Employee(String name) {
        super(name);
        System.out.println("on Employee constructor");
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getSalary());
    }

    public void salaryReport() {
        System.out.println("i " + this.name + ", confirm the payment of " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
