package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import academy.devdojo.maratonajava.javacore.Oexception.runtime.domain.Employee;
import academy.devdojo.maratonajava.javacore.Oexception.runtime.domain.Person;

public class OverwriteWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        employee.save();
    }
}
