package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Jonas";
        employee.age = 22;
        employee.wages = new double[]{2.500, 2.600, 2.500};

        employee.print(employee);

    }
}
