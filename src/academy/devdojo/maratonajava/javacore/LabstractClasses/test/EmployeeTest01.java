package academy.devdojo.maratonajava.javacore.LabstractClasses.test;

import academy.devdojo.maratonajava.javacore.LabstractClasses.domain.Developer;
import academy.devdojo.maratonajava.javacore.LabstractClasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Micheal", 3000);
        Developer developer = new Developer("Ryan", 4000);
        System.out.println(manager);
        System.out.println(developer);
        manager.print();
        developer.print();

    }
}
