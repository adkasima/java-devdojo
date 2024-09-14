package academy.devdojo.maratonajava.javacore.HInheritance.test;

import academy.devdojo.maratonajava.javacore.HInheritance.domain.Adress;
import academy.devdojo.maratonajava.javacore.HInheritance.domain.Employee;
import academy.devdojo.maratonajava.javacore.HInheritance.domain.Person;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.setStreet("Shiganshina");
        adress.setCep("1234-5678");
        Person person = new Person("Levi Ackerman");
        person.setCpf("123456-789");
        person.setAdress(adress);
        person.print();

        Employee employee = new Employee("Mikasa Ackerman");
        employee.setCpf("32103145");
        employee.setAdress(adress);
        employee.setSalary(15000);
        employee.print();
    }
}
