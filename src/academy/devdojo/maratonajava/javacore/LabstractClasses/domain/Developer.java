package academy.devdojo.maratonajava.javacore.LabstractClasses.domain;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }


    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calcBonus() {
        this.salary += this.salary * 0.1;

    }
}
