package academy.devdojo.maratonajava.javacore.LabstractClasses.domain;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calcBonus() {
        this.salary += this.salary * 0.2;

    }
}
